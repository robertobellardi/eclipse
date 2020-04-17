package calcolatrice.statica;

import java.util.Scanner;

public class InterfacciaUtente {

	static Scanner sc=new Scanner(System.in);
	
	static double[] chiediDueNumeri() {
		System.out.print("Inserisci 2 numeri  : ");
		double[] addendi=new double[2];
		addendi[0]=sc.nextDouble();
		addendi[1]=sc.nextDouble();
		return addendi;
	}

}
