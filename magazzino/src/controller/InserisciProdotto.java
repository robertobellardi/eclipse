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

import database.Connessione;

/**
 * Servlet implementation class InserisciProdotto
 */
@WebServlet("/inserisciProdotto")
public class InserisciProdotto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connessione connessione=null;
	private Connection con=null;
	private int rs=0;
	private String queryDate="insert into prodotti (descrizione,prezzo,quantita) values(?,?,?);";
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String descrizione=request.getParameter("descrizione");
		float prezzo=Float.parseFloat(request.getParameter("prezzo"));
		int quantita=Integer.parseInt(request.getParameter("quantita"));
		
		System.out.println(descrizione+" "+prezzo+" "+quantita);
		
		connessione = new Connessione();		
		con=connessione.getConnessione();		
		JSONObject jsonIm = new JSONObject();
		PreparedStatement selectImpegni = null;
		
		if(con!=null) {
			try {		
				selectImpegni=(PreparedStatement)con.prepareStatement(queryDate);
				selectImpegni.setString(1,descrizione);
				selectImpegni.setFloat(2, prezzo);
				selectImpegni.setInt(3,quantita);
				rs=selectImpegni.executeUpdate();
				
				if(rs == 1) {
					jsonIm.put("inserimento",true);
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
