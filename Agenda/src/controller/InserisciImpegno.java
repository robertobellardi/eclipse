package controller;

import java.io.IOException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import databse.Connessione;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet("/inserisciImpegno")
public class InserisciImpegno extends HttpServlet {
		
	private Connessione connessione=null;
	private Connection con=null;
	private Statement st=null;
	private ResultSet rs=null;
	private String queryDate="select * from impegno where data='";
	private String insertDate="insert into impegno (nome,luogo,priorita,data) values (";
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String impegno=request.getParameter("impegno");
		String luogo=request.getParameter("luogo");
		String priorita=request.getParameter("priorita");
		String orario=request.getParameter("orario");
		
		System.out.println(orario);
		//orario=getDateTime(orario);
		
		connessione = new Connessione();
		
		con=connessione.getConnessione();
		
		JSONObject jsonIm = new JSONObject();
		
		if(con!=null) {
			try {
				st=(Statement) con.createStatement();
				rs=st.executeQuery(queryDate+orario+"';");
				System.out.println("Query ricerca");
				if(!rs.next()) {
					jsonIm.put("inserimento",true);
					insertDate+="'"+impegno+"','"+luogo+"','"+priorita+"','"+orario+"');";
					int result=st.executeUpdate(insertDate);
					System.out.println("Query update");
					if(result == 1) {
						st=(Statement) con.createStatement();
						rs=st.executeQuery(queryDate+orario+"';");	
						if(rs.next()) {							
							System.out.println(rs.getInt(1));
							jsonIm.put("id",rs.getInt(1));
							jsonIm.put("impegno",impegno);
							jsonIm.put("luogo",luogo);
							jsonIm.put("priorita",priorita);
							jsonIm.put("orario",orario);
						}
						else
							jsonIm.put("inserimento",false);
					}
					else
						jsonIm.put("inserimento",false);
									}
				else {
					jsonIm.put("inserimento",false);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}			
			response.setContentType("application/json");
		    response.setCharacterEncoding("UTF-8");
		    response.getWriter().write(jsonIm.toString());
		}
	}
	
	protected String getDateTime(String str) {
		
		String s="";
		
		//System.out.println(str.length());
		
		s+=str.charAt(0);
		s+=str.charAt(1);
		s+=str.charAt(2);
		s+=str.charAt(3);
		s+="/";								//anno
		//System.out.println(s);
		
		s+=str.charAt(4);
		s+=str.charAt(5);
		s+="/";								//mese
		//System.out.println(s);
		
		s+=str.charAt(6);
		s+=str.charAt(7);
		s+=" ";								//giorno
		//System.out.println(s);
		
		s+=str.charAt(8);
		s+=str.charAt(9);
		s+=":";								//ore
		//System.out.println(s);
		
		s+=str.charAt(10);
		s+=str.charAt(11);					//minuti
		//System.out.println(s);
		
		//System.out.println(s);
		
		return s;
	} 
}