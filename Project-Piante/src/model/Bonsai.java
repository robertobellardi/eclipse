package model;

public class Bonsai extends Pianta {

	public Bonsai() {
		System.out.println("Ho piantato una pianta");
		System.out.println("Adesso devi bagnarla");
		if(this.famiglia==Famiglie.ANGIOSPERME)
			System.out.println("come le angiosperme");
		System.out.println(this.specie);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
