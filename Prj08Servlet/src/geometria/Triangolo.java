package geometria;
import model.Figura;

public class Triangolo extends Figura{
	
	private Punto a,b,c;
	private Segmento l1,l2,l3;
	
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		l1=new Segmento(a, b);
		l2=new Segmento(b, c);
		l3=new Segmento(c, a);
	}
	
	public Triangolo(Segmento l1, Segmento l2, Segmento l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		a=l1.getA();
		b=l1.getB();
		c=l2.getB();
	}
	
	public double getPerimetro() {
		return l1.getL()+l2.getL()+l3.getL();
	}
	
	public double getArea() {
		double semip=getPerimetro()/2;
		return Math.sqrt(semip*((semip-l1.getL())+(semip-l2.getL())+(semip-l3.getL())));
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}

	public Punto getC() {
		return c;
	}

	public void setC(Punto c) {
		this.c = c;
	}

	public Segmento getL1() {
		return l1;
	}

	public void setL1(Segmento l1) {
		this.l1 = l1;
	}

	public Segmento getL2() {
		return l2;
	}

	public void setL2(Segmento l2) {
		this.l2 = l2;
	}

	public Segmento getL3() {
		return l3;
	}

	public void setL3(Segmento l3) {
		this.l3 = l3;
	}
}
