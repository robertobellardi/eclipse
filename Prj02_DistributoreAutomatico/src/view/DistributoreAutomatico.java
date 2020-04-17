package view;

import java.util.Scanner;

import controller.ListaBevande;

public class DistributoreAutomatico {

	static ListaBevande lb;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lb=new ListaBevande();
		lb.riempiLista();
		stampaScelta(stampaMenu());
		
	}
	
	public static String stampaMenu() {
		System.out.println("Inserisci :");
		for(int i=0;i<lb.getBevande().size();i++) {			
			System.out.println(i+1+"---> "+lb.getBevande().get(i).getName());
		}
		return sc.nextLine();
	}
	
	public static void stampaScelta(String scelta) {
		int scel=Integer.parseInt(scelta);
		if(scel > 0 && scel <= lb.getBevande().size()) {
			System.out.println("Hai scelto ---> "+lb.getBevande().get(scel-1).getName());
			inserisciMonete(lb.getBevande().get(scel-1).getPrice());
		}
		else
			System.out.println("Scelta non valida");
	}
	
	public static void inserisciMonete(double price) {
		
		double prezzoUte=0;
		do {
			System.out.println("Inserisci : "+(price-prezzoUte)+"€");
			prezzoUte+=sc.nextDouble();
			if(prezzoUte>=price) {
				System.out.println("Ecco la bevanda");
				System.out.println("resto di : "+(prezzoUte-price)+"€");
			}
			else
				System.out.println("Non bastano");
		}while(prezzoUte<price);
	}

}
