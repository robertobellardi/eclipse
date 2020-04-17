package mappa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Regione implements Comparable<Regione>{
	
	String nome;
	String capoluogo;
	int abitanti;
	
	public Regione(String nome, String capoluogo,int abitanti) {
		this.nome = nome;
		this.capoluogo = capoluogo;
		this.abitanti=abitanti;
	}
	
	@Override
	public String toString() {
		return "nome: "+nome+" capoluogo : "+capoluogo+" abitanti : "+abitanti+"\n";
	}

	@Override
	public int compareTo(Regione o) {
		if(this.abitanti-o.abitanti != 0)
			return this.abitanti-o.abitanti;
		else
			return this.nome.compareTo(o.nome);
	}	
}


public class Mappa1 {

	public static void main(String[] args) {
		
		//  chiave valore
		Map<String,String> capoluoghi=new HashMap<>();
		
		capoluoghi.put("piemonte", "torino");
		capoluoghi.put("lombardia", "milano");
		capoluoghi.put("campania", "napoli");
		
		System.out.println(capoluoghi.get("piemonte"));
		capoluoghi.put("piemonte", "cuneo");
		System.out.println(capoluoghi.get("piemonte"));
		
		Set<String> regioni=capoluoghi.keySet();
		
		for (String regione : regioni) {
			System.out.println(regione);
		}
		
		System.out.println(regioni);// uso il toString per stampare
		
		System.out.println("Mappa con classe Regione\n");
		
		Map<Regione,String> mappa=new HashMap<>();
		
		mappa.put(new Regione("piemonte", "torino",400), "torino");
		mappa.put(new Regione("lombardia", "milano",100), "milano");
		mappa.put(new Regione("basilicata", "napoli",300), "napoli");
		mappa.put(new Regione("toscana", "firenze",900), "napoli");
		
		Set<Regione> reg=mappa.keySet();
		
		for (Regione regione : reg) {
			System.out.println(regione);
		}	
		
		Collection<String> citta=capoluoghi.values();
		citta.forEach(c -> System.out.println(c.charAt(0)));
		
		//programmazione funzionale
		
		citta
		.stream()
		.filter(c-> c.startsWith("c"))
		.forEach(c -> System.out.println(c));
		
	}	
}