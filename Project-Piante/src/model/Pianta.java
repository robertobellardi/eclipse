package model;

public abstract class Pianta {

	public Specie specie;
	public Double altezza;
	public Famiglie famiglia; 
	
	@Override
	public String toString() {
		return "Pianta [specie=" + specie + ", altezza=" + altezza + ", famiglia=" + famiglia + "]";
	}
	
}
