package model;

public class Prodotto {
	
	private String nome;
	private String quantita;
	
	public Prodotto(String nome, String quantita) {
		this.nome = nome;
		this.quantita = quantita;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getQuantita() {
		return quantita;
	}
	
	public void setQuantita(String quantita) {
		this.quantita = quantita;
	}
	
	public String toString() {
		return "\nNome : "+nome+"\nQuantità : "+quantita;
	}

}
