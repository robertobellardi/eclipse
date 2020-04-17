package model;

public class Testo implements Pubblicabile{

	private String testo;
	
	public Testo(String testo) {
		this.testo=testo;
	}

	public String getTesto() {
		return testo;
	}
	
	@Override
	public void pubblica() {
		System.out.println("testo : "+this.testo);
		
	}

	@Override
	public String getName() {
		return testo;
	}

	@Override
	public String getClassName() {
		return "Testo";
	}
}
