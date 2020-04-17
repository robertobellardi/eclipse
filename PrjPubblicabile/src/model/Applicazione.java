package model;

public class Applicazione implements Pubblicabile{

	private String nomeApp;
	
	public Applicazione(String nomeApp) {
		this.nomeApp=nomeApp;
	}

	public String getNomeApp() {
		return nomeApp;
	}
	
	@Override
	public void pubblica() {
		System.out.println("applicazione : "+this.nomeApp);
		
	}

	@Override
	public String getName() {
		return nomeApp;
	}

	@Override
	public String getClassName() {
		return "Applicazione";
	}
}
