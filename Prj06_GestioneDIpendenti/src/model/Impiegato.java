package model;

public class Impiegato extends Dipendente {

private int nOreLav;
	
	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
		nOreLav=0;
	}
	
	public int getNOreLav() {
		return nOreLav;
	}

	public void setNOreLav(int numConsegne) {
		this.nOreLav = numConsegne;
	}
	
	public double calcolaStipendio() {
		return 9.5 * nOreLav;
	}

}
