package model;

public class Quadrato extends Rettangolo {

	public Quadrato(Punto a, Punto b, Punto c, Punto d) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Quadrato r=new Quadrato(new Punto(0,0),new Punto(3,0),new Punto(3,3),new Punto(0,3));
		System.out.println(r.getPerimetro());
		System.out.println(r.getArea());
	}

}
