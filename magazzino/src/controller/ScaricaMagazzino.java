package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import database.Connessione;

@WebServlet("/scaricaMagazzino")
public class ScaricaMagazzino extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connessione connessione=null;
	private Connection con=null;
	private ResultSet rs=null;
	private String queryDate="select * from prodotti";
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		connessione = new Connessione();		
		con=connessione.getConnessione();		
		JSONObject jsonArray = new JSONObject();
		PreparedStatement selectImpegni = null;
		
		if(con!=null) {
			try {		
				selectImpegni=(PreparedStatement)con.prepareStatement(queryDate);
				rs=selectImpegni.executeQuery();
				
				while(rs.next()) {
					JSONObject jsonIm = new JSONObject();
					jsonIm.put("id",rs.getInt(1));
					jsonIm.put("descrizione",rs.getString(2));
					jsonIm.put("prezzo",rs.getFloat(3));
					jsonIm.put("quantita",rs.getInt(4));
					jsonArray.put(rs.getString(1), jsonIm);
				}
			} catch (SQLException e) {
				System.out.println("Errore query select");
			}	
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Errore chiusura query select");
			}
		}
		else {
			jsonArray.put("risposta", false);
		}		
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(jsonArray.toString());
	}
}
