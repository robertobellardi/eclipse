package todo;

import java.io.IOException;
import java.util.Scanner;

public class ProvaToDoList {
	
	static ToDoList tdl;
	static Scanner sc=new Scanner(System.in);;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		sc.close();
	}
	
	public static void menu() {		
		int scelta=0;
		String errore=null;
		
		do {
			System.out.println("\n1: Crea Lista");
			System.out.println("2: Scegli lista");
			System.out.print("Altro per uscire : ");
			if(sc.hasNextInt()) {
				scelta=sc.nextInt();
				eseguiScelta(scelta);
			}
			else {
				System.out.println("Uscita menu");
				errore=sc.next();
			}			
		}while(errore==null && scelta>=1 && scelta<=2);
		
		if(errore==null)
			System.out.println("Uscita menu");
		
		try {
			 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public static void eseguiScelta(int scelta) {
			
		switch(scelta) {		
			case 1:	
				System.out.print("\nInserisci il nome della lista : ");
				tdl=new ToDoList(sc.next());
				sceltaLista(sc);
				break;
			
			case 2:
				scelta2();
				break;
		}
	}
	
	
	public static void sceltaLista(Scanner sc) {
		int scelta=0;
		String errore=null;
		
		do {
			System.out.println("\n1: Aggiungere una voce alla lista");
			System.out.println("2: Rimuovere una voce dalla lista passando la voce");
			System.out.println("3: Rimuovere una voce dalla lista passando l'indice");
			System.out.println("4: Per stampare la lista");
			System.out.print("Altro per tornare al menu principale : ");
			if(sc.hasNextInt()) {
				scelta=sc.nextInt();
				eseguiSceltaLista(scelta);
			}
			else {
				errore=sc.next();
			}			
		}while(errore==null && scelta>=1 && scelta<=4);
	}
	
public static void eseguiSceltaLista(int scelta) {
		
		switch(scelta) {
		
			case 1:	
				scelta1(sc);
				break;
			
			case 2:
				System.out.print("\nScrivi la voce da rimuovere dalla lista :");
				tdl.remove(sc.nextLine());
				break;
				
			case 3:
				System.out.print("\nScrivi un indice per rimuovere una voce dalla lista :");
				tdl.remove(sc.nextInt());
				break;
				
			case 4:
				System.out.println(tdl);		
				break;
		}
	}
	
	public static void scelta1(Scanner sc) {
		System.out.print("\nScrivi una voce da inserire in lista : ");
		String str=sc.next();
		System.out.print("Inserisci una quantita per la voce precedente : ");
		int q=sc.nextInt();
		tdl.addToDo(new ToDo(str,q));
		System.out.println("Voce aggiunta");
	}	
	
	public static void scelta2() {
		System.out.println("\nFunzione non ancora implementata");
	}
	
	
	
	
	

}
