package model;

public class Prodotto implements Comparable<Prodotto>{
	private String nome;
	private double prezzo;
	
	public Prodotto(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return "nome " + nome + " prezzo " + prezzo + "\n";
	}
	
	@Override
	public int compareTo(Prodotto o) {
		return this.getNome().compareTo(o.getNome());
	}	
}
