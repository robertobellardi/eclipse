package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import database.Connessione;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

@WebServlet("/richiestaLogin")
public class RichiestaLogin extends HttpServlet {
		
	private Connessione connessione=null;
	private Connection con=null;
	private ResultSet rs=null;
	private String queryMail="select * from utente where email=?";
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail=request.getParameter("mail");
		String password=request.getParameter("password");
		
		System.out.println(mail +" --- "+password);
		
		connessione = new Connessione();
		
		con=connessione.getConnessione();
		PreparedStatement selectMail = null;
		
		JSONObject jsonIm = new JSONObject();
		
		if(con!=null) {
			try {
				selectMail=(PreparedStatement)con.prepareStatement(queryMail);
				selectMail.setString(1, mail);
				rs=selectMail.executeQuery();
				
				if(rs.next()) {
					if(rs.getString(3).equals(password)) {
						jsonIm.put("login",true);
						jsonIm.put("id",rs.getString(1));
					}				
					else {
						jsonIm.put("login",false);
						jsonIm.put("errore","password errata");
					}					
					System.out.println("Query login");
				}
				else {
					jsonIm.put("login",false);
					jsonIm.put("errore","mail non registrata");
				}
			} catch (SQLException e) {
				System.out.println("Errore query");
			}
			
			try {
				selectMail.close();
			} catch (SQLException e) {
				System.out.println("Errore chiusura query");
			}
		}
		else {
			jsonIm.put("login",false);
			jsonIm.put("errore","server offline");
		}
		
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(jsonIm.toString());
	}
	
	protected String checkXSS(String str) {
		String sanitize="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '<') {
				while(str.charAt(i) != '>') {
					i++;
				}
			}
			else
				sanitize+=str.charAt(i);
		}
		System.out.println("Sanitize ---> "+sanitize);
		return sanitize;
	}
}