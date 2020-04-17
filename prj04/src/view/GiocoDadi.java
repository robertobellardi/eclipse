package view;

import controller.Gioco;

public class GiocoDadi {

	public static void main(String[] args) {
		
		long start=System.currentTimeMillis();
		
		Gioco g=new Gioco();
		
		System.out.println(g.gioca(1000000000));//1 miliardo
		
		long end=System.currentTimeMillis()-start;
		System.out.println("Tempo ---> "+(end/1000)+" secondi");				
	}
}
	

