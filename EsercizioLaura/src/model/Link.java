package model; //vedi applicazione

public class Link implements Pubblicabile{

	
	private String nomeLink;
	
	public Link(String nomeLink) {
		
		this.nomeLink = nomeLink;
		
	}
	
	@Override
	public void pubblica() {
		
		System.out.println(nomeLink);
	}

	public String getNomeLink() {
		
		return nomeLink;
		
		
	}
	
	public String toString() {
		return ("Link: " + nomeLink);
	}

}
