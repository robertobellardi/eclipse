package controller;

import java.util.ArrayList;

import model.Pubblicabile;

//singleton pattern
public class Portale { 
	
	private static Portale istanza;
	
	
	private Portale() {
		
		numElement = 0;
		//se non inizializzo l'AL è null
		lista = new ArrayList<>();
			
	}
	//se istanza è null ti crea l'oggetto e te lo ritorna, altrimenti lo ritorna e basta
	public static Portale getPortale() {
		if (istanza == null) 
			istanza = new Portale();
		return istanza;
		
	}
	
	
	private int numElement;
	
	private ArrayList<Pubblicabile> lista;
	
	public void addElement (Pubblicabile p) {
		
		lista.add(p);
		numElement++;
		
	}
	
	public void pubblicaTutto () {
		
		
		for (int i = 0; i < numElement ; i++) {
			
			System.out.println(lista.get(i));
			
		}
	
		
	}

}
