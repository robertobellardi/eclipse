package controller;

import java.util.ArrayList;
import java.util.List;

import model.Prodotto;
import model.Salato;
import model.Dolce;
import model.Bevanda;

public class Prodotti {

	static List<Prodotto> prodotti= new ArrayList<>();
	
	static {
		//salato
		Prodotti.aggiungiProdotto(new Salato("panino",5.0));
		Prodotti.aggiungiProdotto(new Salato("pasta",3.0));
		
		//dolci
		Prodotti.aggiungiProdotto(new Dolce("torta",5.0));
		Prodotti.aggiungiProdotto(new Dolce("biscotti",3.0));  
		
		//bevande
		Prodotti.aggiungiProdotto(new Bevanda("CocaCola",5.0));
		Prodotti.aggiungiProdotto(new Bevanda("Fanta",3.0));
		
	}
	
	static void aggiungiProdotto(Prodotto p){
		prodotti.add(p);
	}
	
	public static List<Prodotto> elenco(){
		return prodotti;
	}
	
	static ArrayList<Prodotto> filtraElenco(String str){
		ArrayList<Prodotto> ap=new ArrayList<>();
		
		for (Prodotto prodotto : Prodotti.elenco()) {
			switch(str) {
				case "bevande":
					if(prodotto instanceof Bevanda)
						ap.add(prodotto);
				break;
				
				case "salati":
					if(prodotto instanceof Salato)
						ap.add(prodotto);
				break;
					
				case "dolci":
					if(prodotto instanceof Dolce)
						ap.add(prodotto);
				break;
			}
		}		
		return ap;
	}
	
	
	
	
}