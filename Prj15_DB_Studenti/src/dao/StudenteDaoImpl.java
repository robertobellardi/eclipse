package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import java.sql.Statement;

import databse.Connessione;
import model.Studente;

public class StudenteDaoImpl implements StudenteDao{
	
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	Connessione c=new Connessione();
	ArrayList<Studente> studenti= new ArrayList<>();	

	@Override
	public ArrayList<Studente> getAll() throws SQLException {
		con = c.getConnessione();
		st=con.createStatement();
		rs=st.executeQuery(TROVA_TUTTI);
		while(rs.next()) {
			studenti.add(new Studente(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		
		return studenti;
	}

	@Override
	public void addStudente(Studente st) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudente(Studente st) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudente(Studente st) throws SQLException {
		// TODO Auto-generated method stub
		
	}



}
