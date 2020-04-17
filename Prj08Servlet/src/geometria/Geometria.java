package geometria;

import java.util.ArrayList;

import model.Figura;

public class Geometria {
	public static void main(String[] args) {
		
		ArrayList<Figura> casa=new ArrayList<>();
		
		Rettangolo salotto=new Rettangolo(new Punto(0,0),new Punto(4,0),new Punto(4,3),new Punto(0,3));
		salotto.setNomeCamera("salotto");
		Rettangolo cucina=new Rettangolo(new Punto(0,0),new Punto(2,0),new Punto(2,3),new Punto(0,3));
		cucina.setNomeCamera("cucina");
		Quadrato ingresso=new Quadrato(new Punto(0,0),new Punto(4,0),new Punto(4,4),new Punto(0,4));
		ingresso.setNomeCamera("ingresso");
		Quadrato bagno=new Quadrato(new Punto(0,0),new Punto(3,0),new Punto(3,3),new Punto(0,3));
		bagno.setNomeCamera("bagno");
		Triangolo cameraLetto1=new Triangolo(new Punto(0,0),new Punto(6,0),new Punto(3,5));
		cameraLetto1.setNomeCamera("camera da letto");
		Triangolo cameraLetto2=new Triangolo(new Punto(0,5),new Punto(6,5),new Punto(3,10));
		cameraLetto2.setNomeCamera("camera da letto");	
		
		casa.add(salotto);
		casa.add(cucina);
		casa.add(ingresso);
		casa.add(bagno);
		casa.add(cameraLetto1);
		casa.add(cameraLetto2); 
		
		Quadrato pstr=new Quadrato(new Punto(0,0),new Punto(1,0),new Punto(1,1),new Punto(0,1));
		double metratura=0;
		
		for(int i=0;i<casa.size();i++)
			metratura+=casa.get(i).getArea();
		
		double numpstr=metratura/pstr.getArea();
		
		System.out.println("Metratura ---> "+metratura);
		System.out.println("Numero piastrelle ---> "+numpstr);
		
		System.out.println("\nLa mia casa");
		for(int i=0;i<casa.size();i++)
			System.out.println(casa.get(i));
		
	}

}
