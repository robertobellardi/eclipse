package controller;

import java.util.ArrayList;

import model.Bevanda;

public class ListaBevande {
	
	private ArrayList<Bevanda> bevande;
	private int numberOf;
	private final int defaultNumberOf=4;

	public ListaBevande() {
		// TODO Auto-generated constructor stub
		this.numberOf=this.defaultNumberOf;
		bevande=new ArrayList<>(this.numberOf);
	}
	
	public ListaBevande(int numberOf) {
		// TODO Auto-generated constructor stub
		if(numberOf>0)
			this.numberOf = numberOf;
		else {
			System.out.println("Numero non valido, assegnato numero di default");
			this.numberOf=defaultNumberOf;
		}
		bevande=new ArrayList<>(this.numberOf);
	}	

	public ArrayList<Bevanda> getBevande() {
		return bevande;
	}

	public void setBevande(ArrayList<Bevanda> bevande) {
		this.bevande = bevande;
	}

	public int getNumberOf() {
		return numberOf;
	}

	public void setNumberOf(int numberOf) {
		if(numberOf>0)
			this.numberOf = numberOf;
		else {
			System.out.println("Numero non valido, assegnato numero di default");
			this.numberOf=defaultNumberOf;
		}
	}
	
	public void riempiLista() {
		// TODO Auto-generated constructor stub
		bevande.add(new Bevanda("caffè", 0.30));
		bevande.add(new Bevanda("caffe lungo", 0.45));
		bevande.add(new Bevanda("caffè macchiato", 0.50));
		bevande.add(new Bevanda("the", 0.30));
		
	}

	public String stampa() {
		String stampa="";
		for(int i=0;i<bevande.size();i++)
			stampa+=bevande.get(i).toString();
		return stampa;
	}
}
