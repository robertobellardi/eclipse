package controller;

import java.io.IOException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import databse.Connessione;

import java.sql.SQLException;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet("/eliminaImpegno")
public class EliminaImpegno extends HttpServlet {
		
	private Connessione connessione=null;
	private Connection con=null;
	private String queryDelete="delete from impegno where id=?;";
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		connessione = new Connessione();		
		con=connessione.getConnessione();
		PreparedStatement deleteImpegno = null;
		String id=request.getParameter("id");
		System.out.println("L'id � ---> "+id);

		JSONObject jsonRisposta = new JSONObject();
		
		if(con!=null) {
			try {
				deleteImpegno=(PreparedStatement)con.prepareStatement(queryDelete);
				deleteImpegno.setString(1,id);
				int res=deleteImpegno.executeUpdate();
				
				System.out.println(res);
	
				if(res == 1)			
					jsonRisposta.put("elimina", true);
				else
					jsonRisposta.put("elimina", false);
				
			} catch (SQLException e) {
				System.out.println("Errore query delete");
			}
			try {
				deleteImpegno.close();
			} catch (SQLException e) {
				System.out.println("Errore chiusura query delete");
			}
		}
		else
			jsonRisposta.put("elimina", false);
		
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(jsonRisposta.toString());
	}
}