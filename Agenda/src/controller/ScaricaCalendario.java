package controller;

import java.io.IOException;
import com.mysql.jdbc.Connection;
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

import org.json.JSONObject;

@WebServlet("/scaricaCalendario")
public class ScaricaCalendario extends HttpServlet {
		
	private Connessione connessione=null;
	private Connection con=null;
	private Statement st=null;
	private ResultSet rs=null;
	private String queryDate="select * from impegno;";
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		connessione = new Connessione();		
		con=connessione.getConnessione();		
		JSONObject jsonArray = new JSONObject();
		
		if(con!=null) {
			try {
				st=(Statement) con.createStatement();
				rs=st.executeQuery(queryDate);
				int i=1;
				while(rs.next()) {
					JSONObject jsonIm = new JSONObject();
					jsonIm.put("id",rs.getString(1));
					jsonIm.put("impegno",rs.getString(3));
					jsonIm.put("luogo",rs.getString(4));
					jsonIm.put("priorita",rs.getString(5));
					jsonIm.put("orario",rs.getString(6));
					jsonArray.put("impegno"+i, jsonIm);
					i++;
				}
			} catch (SQLException e) {
				System.out.println("Errore query select");
			}	
			try {
				st.close();
			} catch (SQLException e) {
				System.out.println("Errore chiusura query select");
			}
			response.setContentType("application/json");
		    response.setCharacterEncoding("UTF-8");
		    response.getWriter().write(jsonArray.toString());
		}		
	}
}