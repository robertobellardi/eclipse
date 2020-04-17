package geometria;
import model.Figura;

public class Rettangolo extends Figura{
	
	private Punto a,b,c,d;
	private Segmento base,altezza;
		
	public Rettangolo(Punto a, Punto b, Punto c, Punto d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		base=new Segmento(a, b);
		altezza=new Segmento(b, c);
	}
		
	public double getPerimetro() {
		return base.getL()*2+altezza.getL()*2;
	}
	
	public double getArea() {
		return base.getL()*altezza.getL();
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

	public Punto getD() {
		return d;
	}

	public void setD(Punto d) {
		this.d = d;
	}

	public Segmento getBase() {
		return base;
	}

	public void setBase(Segmento base) {
		this.base = base;
	}

	public Segmento getAltezza() {
		return altezza;
	}

	public void setAltezza(Segmento altezza) {
		this.altezza = altezza;
	}
}
