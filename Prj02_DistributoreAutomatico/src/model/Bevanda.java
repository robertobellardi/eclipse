package model;

public class Bevanda {
	
	private String name;
	private Double price;
	private final Double defaultPrice=0.30;

	public Bevanda(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.price=this.defaultPrice;
	}
	
	public Bevanda(String name,Double price) {
		// TODO Auto-generated constructor stub
		this.name=name;
		if(price>0)
			this.price = price;
		else {
			System.out.println("Prezzo non valido, assegnato prezzo di default");
			this.price=defaultPrice;
		}
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		if(price>0)
			this.price = price;
		else {
			System.out.println("Prezzo non valido, assegnato prezzo di default");
			this.price=this.defaultPrice;
		}
	}
	
	public String toString() {
		return "Nome\t : "+this.name+"\nPrezzo\t : "+this.price+"\n\n";
	}
	
	public String stampa() {
		return "Nome : "+this.name+" ----- Prezzo: "+this.price+"\n\n";
	}

}
