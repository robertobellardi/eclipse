package model;

public class Applicazioni implements Pubblicabile{

	
	private String nomeApp; //propriet� 
	
	public Applicazioni(String nomeApp) { 
	//Costruttore: quando viene creata l'app la propriet� nomeApp viene settata con la stringa che l'utente passa nel MAIN
		
		
		this.nomeApp = nomeApp;
		
	}
	
	
	public void pubblica() {
		
		System.out.println(nomeApp);
	}

	public String getNomeApp() {
		
		return nomeApp;
		
		
	}
	
	//quando stampo il nome dell'app anzich� stampare solo quello mi stamper� ogni volta tutto ci� che c'� nella parentesi
	public String toString() {
		return ("Applicazione: " + nomeApp);
	}
	

}
