package geometria;

public class Segmento {

	private Punto a,b;
	private double l;
	
	

	public Segmento() {
		this.a = new Punto();
		this.b = new Punto();
		setL();
	}
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
		setL();
		
	}	
	
	public Punto getA() {
		return a;
	}

	public Punto getB() {
		return b;
	}

	public void setA(Punto a) {
		this.a = a;
		setL();
	}

	public void setB(Punto b) {
		this.b = b;
		setL();
	}
	
	public double getL() {
		return l;
	}
	
	public void setL() {
		this.l=Math.sqrt(Math.pow(a.getX()-b.getX(),2) + Math.pow(a.getY()-b.getY(),2));
	}

	@Override
	public String toString() {
		return "Segmento [" + a + "," + b + "]"+"\nlunghezza = "+l;
	}
}
