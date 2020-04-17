package model;

public class Applicazioni implements Pubblicabile{

	
	private String nomeApp; //proprietà 
	
	public Applicazioni(String nomeApp) { 
	//Costruttore: quando viene creata l'app la proprietà nomeApp viene settata con la stringa che l'utente passa nel MAIN
		
		
		this.nomeApp = nomeApp;
		
	}
	
	
	public void pubblica() {
		
		System.out.println(nomeApp);
	}

	public String getNomeApp() {
		
		return nomeApp;
		
		
	}
	
	//quando stampo il nome dell'app anzichè stampare solo quello mi stamperà ogni volta tutto ciò che c'è nella parentesi
	public String toString() {
		return ("Applicazione: " + nomeApp);
	}
	

}
