package esempinaula;

public class Bicicletta {
	
	private int ruote;
	private double prezzo;
	private String marca;
	private String colore;
	private int marcia;
	private int cadenza;
	private double velocita;


	public Bicicletta(double prezzo,String marca,String colore) {
		// TODO Auto-generated constructor stub
		this.ruote=2;
		this.marca=marca;
		this.prezzo=prezzo;
		this.marcia=0;
		this.cadenza=0;
		this.velocita=0;
		this.colore=colore;
	}
	
	public void setMarcia(int marciaCorrente) {
		this.marcia=marciaCorrente;
	}
	
	public void setCadenza(int cadenzaCorrente) {
		this.cadenza=cadenzaCorrente;
	}
	
	public void setColore(String colore) {
		this.colore=colore;
	}
	
	public String getColore() {
		return this.colore;
	}
	
	public int getMarcia() {
		return this.marcia;
	}
	
	public int getCadenza() {
		return this.cadenza;
	}
	
	public String toString() {
		return "Bicicletta"+
				"\nmarca : \t"+this.marca+
				"\ncolore : \t"+this.colore+
				"\nnumero ruote : \t"+ this.ruote+
				"\nprezzo : \t"+this.prezzo+
				"\n";
	}
	
	public double getVelocita() {
		velocita=marcia*cadenza*1.90*60/1000;
		return this.velocita;
	}
}
