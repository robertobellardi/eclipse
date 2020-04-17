package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Prodotto;

public class ListaSpesa {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {

		
		System.out.print("Inserisci la dimensione della lista : ");
		int dim=Integer.parseInt(sc.nextLine());
		ArrayList<Prodotto> prodotti=new ArrayList<>(dim);
				
		for(int i=0;i<3;i++) {
			prodotti.add(caricaProdotto());
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(prodotti.get(i));
		}
		
		sc.close();
	}
	
	private static Prodotto caricaProdotto() {
		
		System.out.print("Inserisci nome prodotto : ");
		String nome=sc.nextLine();
		System.out.print("Inserisci quantità prodotto : ");
		String quantita=sc.nextLine();
		Prodotto p=new Prodotto(nome,quantita);		
		return p;
	}

}
