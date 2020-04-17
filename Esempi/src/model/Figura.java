package model;

public abstract class Figura {

	protected String nomeCamera="";
	public abstract double getArea();
	public abstract double getPerimetro();
	
	public String toString() {
		return nomeCamera;
	}
	
	public String getNomeCamera() {
		return nomeCamera;
	}
	
	public void setNomeCamera(String nomeCamera) {
		this.nomeCamera = nomeCamera;
	}
}
