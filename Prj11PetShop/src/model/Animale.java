package model;

import java.time.LocalDate;

public abstract class Animale {
	
	private String nome;
	private double prezzo;
	private boolean soddisfazione;
	private LocalDate dataNascita;
	
	public abstract void mangia(Commestibile c);
	public abstract boolean isSoddisfatto(boolean b);
	
	
	
	public boolean isSoddisfazione() {
		return soddisfazione;
	}
	public void setSoddisfazione(boolean soddisfazione) {
		this.soddisfazione = soddisfazione;
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
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	@Override
	public String toString() {
		return "Animale [nome=" + nome + ", prezzo=" + prezzo + ", dataNascita=" + dataNascita + "]";
	}	
}
