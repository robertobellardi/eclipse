package model;

public class Dipendente {

	private String nome;
	private String cognome;
	private int matricola;
	private static int cont=0;
	
	public Dipendente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		setNumMat();				
	}
	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getMatricola() {
		return matricola;
	}
	
	private void setNumMat() {
		this.matricola = cont++;
	}
	
	public int getNumMat() {
		return cont;
	}
	
	public double calcolaStipendio(){
		return 500;
	}

	@Override
	public String toString() {
		return "Nome = " + nome + "\nCognome = " + cognome + "\nMatricola = " + matricola+"\nStipendio guadagnato : "+calcolaStipendio()+"\n";
	}
}