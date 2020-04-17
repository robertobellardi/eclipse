package model;

import java.util.Random;

public class Dado {
	
	private String colore;
	private int nFacce;
	private int valoreDado;

	public Dado(String colore,int nFacce) {
		this.colore=colore;
		this.nFacce=nFacce;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public int getnFacce() {
		return nFacce;
	}
	
	public void setnFacce(int nFacce) {
		this.nFacce = nFacce;
	}
	
	public int getValoreDado() {
		return valoreDado;
	}
	
	public int lancia() {
		Random rand=new Random();
		valoreDado=rand.nextInt(nFacce)+1;
		return valoreDado;
	}
	
	public String toString(){
		return "Dado : "+colore+"\nnumero facce : "+nFacce+"\n";
	}


	
	

}
