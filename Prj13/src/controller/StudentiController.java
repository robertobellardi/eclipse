package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import databse.Connessione;
import model.Studente;

public class StudentiController {
	
	private Statement statement=null;
	private ResultSet rs=null;

	private ArrayList<Studente> ar=new ArrayList<>();
	
	public StudentiController() {
		caricaStudenti();
	}
	
	public ArrayList<Studente> getAr() {
		return ar;
	}

	public void setAr(ArrayList<Studente> ar) {
		this.ar = ar;
	}

	private void caricaStudenti() {
		Connessione con=new Connessione();
		Connection connessione=con.getConnessione();
		
		try {
			statement=connessione.createStatement();
			
			String sql="select studente_id,nome,cognome from studente";
			rs=statement.executeQuery(sql);
			
			while(rs.next()) {
				ar.add(new Studente(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String stampa() {
		
		String str="";
		
		for(int i=0;i<ar.size();i++) {
			str+=ar.get(i).getId()+"-"+ar.get(i).getNome()+"-"+ar.get(i).getCognome()+"\n";
		}
		return str;
	}
	
	
}
