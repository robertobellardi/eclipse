package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import database.Connessione;

/**
 * Servlet implementation class EliminaProdotto
 */
@WebServlet("/eliminaProdotto")
public class EliminaProdotto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connessione connessione=null;
	private Connection con=null;
	private int rs=0;
	private String queryDate="delete from prodotti where id=?;";
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id=request.getParameter("id");
		
		System.out.println(id);
		
		connessione = new Connessione();		
		con=connessione.getConnessione();		
		JSONObject jsonIm = new JSONObject();
		PreparedStatement selectImpegni = null;
		
		if(con!=null) {
			try {		
				selectImpegni=(PreparedStatement)con.prepareStatement(queryDate);
				selectImpegni.setString(1,id);
				rs=selectImpegni.executeUpdate();
				
				if(rs == 1) {
					jsonIm.put("eliminazione",true);
				}
			} catch (SQLException e) {
				System.out.println(e);
				System.out.println("Errore query select");
				jsonIm.put("risposta",false);
			}	
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Errore chiusura query select");
				jsonIm.put("risposta",false);
			}
		}
		else {
			jsonIm.put("risposta",false);
		}		
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(jsonIm.toString());
	}
}
