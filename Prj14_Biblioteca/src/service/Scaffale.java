package service;

public class Scaffale {

	private final int CAPIENZA = 10;
	private int numero;
	
	public Scaffale(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCAPIENZA() {
		return CAPIENZA;
	}
}