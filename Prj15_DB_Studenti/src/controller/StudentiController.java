package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.StudenteDaoImpl;
import model.Studente;

public class StudentiController {

	public ArrayList<Studente> studenti=new ArrayList<>();	
	StudenteDaoImpl std= new StudenteDaoImpl();
	
	public ArrayList<Studente> getAll() throws SQLException{
		studenti= std.getAll();
		return studenti;
	}
	
}
