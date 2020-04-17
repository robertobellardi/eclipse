package model;

public class Fattorino extends Dipendente {
	
	private int numConsegne;
	
	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		numConsegne=0;
	}
	
	public int getNumConsegne() {
		return numConsegne;
	}

	public void setNumConsegne(int numConsegne) {
		this.numConsegne = numConsegne;
	}
	
	public double calcolaStipendio() {
		return 2.5 * numConsegne;
	}
}
