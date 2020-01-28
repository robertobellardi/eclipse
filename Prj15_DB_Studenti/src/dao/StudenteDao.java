package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Studente;

public interface StudenteDao {
	
	String TROVA_TUTTI="select studente_id,nome,cognome from studente";
	
	ArrayList<Studente> getAll() throws SQLException;
	void addStudente(Studente st) throws SQLException;
	void deleteStudente(Studente st) throws SQLException;
	void updateStudente(Studente st) throws SQLException;

}
