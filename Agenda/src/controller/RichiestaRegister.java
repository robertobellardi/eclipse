package controller;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import database.Connessione;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;

@WebServlet("/richiestaRegister")
public class RichiestaRegister extends HttpServlet {
		
	private Connessione connessione=null;
	private Connection con=null;
	private ResultSet rs=null;
	private String queryMail="select * from utente where email=?";
	private String insertUtente="insert into utente (email,password) values (?,?);";
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail=request.getParameter("mail");
		String password=request.getParameter("password");
		String repassword=request.getParameter("repassword");
		
		System.out.println(mail +" --- "+password +" --- "+repassword);
		
		connessione = new Connessione();
		
		con=connessione.getConnessione();
		PreparedStatement selectMail = null;
		PreparedStatement insertUtente = null;
		
		JSONObject jsonIm = new JSONObject();
		
		if(con!=null) {
			try {
				selectMail=(PreparedStatement)con.prepareStatement(queryMail);
				selectMail.setString(1, mail);
				rs=selectMail.executeQuery();
				System.out.println(rs);
				if(!rs.next()) {
					if(password.equals(repassword)) {
						insertUtente=(PreparedStatement)con.prepareStatement(this.insertUtente);
						insertUtente.setString(1, mail);
						insertUtente.setString(2, password);
						
						int result=insertUtente.executeUpdate();
						if(result ==1) {
							rs=selectMail.executeQuery();
							if(rs.next()) {							
								System.out.println(rs.getInt(1));
								jsonIm.put("register",true);
								jsonIm.put("id",rs.getInt(1));
							}
						}
						else {
							jsonIm.put("register",false);
							jsonIm.put("errore","errore richiesta registrazione");
						}
					}				
					else {
						jsonIm.put("register",false);
						jsonIm.put("errore","password diverse");
					}					
					System.out.println("Query register");
				}
				else {
					jsonIm.put("register",false);
					jsonIm.put("errore","mail già registrata");
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
			jsonIm.put("register",false);
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