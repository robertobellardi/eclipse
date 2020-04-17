package model; //vedi applicazione

public class Testo implements Pubblicabile{

	
	private String testo;
	
	public Testo (String testo) {
		
		this.testo = testo;
		
	}
	
	@Override
	public void pubblica() {
		
		System.out.println(testo);
	}

	public String getTesto() {
		
		return testo;
		
		
	}
	
	public String toString() {
		return ("Testo: " + testo);
	}

}