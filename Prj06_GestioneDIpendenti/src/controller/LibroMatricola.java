package controller;

import java.util.ArrayList;
import model.Dipendente;

public class LibroMatricola {

	private ArrayList<Dipendente> dipendenti;

	public LibroMatricola() {
		dipendenti = new ArrayList<>();
		init();
	}
	
	private void init() {
		dipendenti.add(new Dipendente("Roberto","Bellardi"));
		dipendenti.add(new Dipendente("Giuseppe","Rossi"));
		dipendenti.add(new Dipendente("Marco","Verdi"));
	}
	

	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
	public Dipendente getDipendente(int pos) {
		return dipendenti.get(pos);
	}

	public void addDipendente(Dipendente dip) {
		dipendenti.add(dip);
	}
	
	public void removeDipendente(int pos) {
		dipendenti.remove(pos);
	}

	@Override
	public String toString() {
		String s="";
		for(int i=0;i<dipendenti.size();i++)
			s+=dipendenti.get(i).toString()+"\n";
		return s;
	}
	
	
	
	
	
}
