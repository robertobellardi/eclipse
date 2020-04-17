package model;

public class Studente {
	
	private String nome;
	private String cognome;
	private static int matricola=0;
	private int numeroMatricola;
	
	private static int Immatricolatore() {
		return ++matricola;
	}
	
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.numeroMatricola=Immatricolatore();
	}
	
	public Studente(String cognome) {
		this.cognome = cognome;
		this.numeroMatricola=Immatricolatore();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumeroMatricola() {
		return numeroMatricola;
	}

	@Override
	public String toString() {
		return nome + " " + cognome +" "+ numeroMatricola;
	}	
}
