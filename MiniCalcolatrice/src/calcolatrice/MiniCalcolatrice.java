package calcolatrice;

import java.util.Scanner;

public class MiniCalcolatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInput();				
		
	}
	
	public static void getInput() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		double a=0 , b=0;
		String op=" ";
		System.out.print("Inserisci il primo numero : ");
		checkNumber(sc);
		a=sc.nextDouble();
		
		System.out.print("Inserisci il secondo numero : ");
		checkNumber(sc);
		b=sc.nextDouble();
		
		System.out.print("Inserisci l'operatore tra '+' '-' '*' '/' : ");
		op=checkOperation(sc);
		
		if(op.equals("+"))
			printOperetion(sum(a,b));
		else if(op.equals("-"))
			printOperetion(+sub(a,b));
		else if(op.equals("*"))
			printOperetion(+mul(a,b));
		else if(op.contentEquals("/"))
			printOperetion(+div(a,b));
		else
			System.out.println("Carattere non valido");
		
		System.out.println("Grazie per avere scelto il nostro software");		
	}
	
	public static void checkNumber(Scanner sc) {
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Carattere non valido");
			System.out.print("Inserisci un numero : ");
		}
	}
	
	public static String checkOperation(Scanner sc) {
		String op=sc.next();
		while(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
			System.out.println("Carattere non valido");
			System.out.print("Scegli tra '+' '-' '*' '/' : ");
			op=sc.next();
		}
		return op;
	}
	
	public static void printOperetion(double a) {
		System.out.println("Il risultato è "+a);
	}
	
	public static Double sum(double a ,double b) {
		return a+b;
	}
	
	public static Double sub(double a ,double b) {
		return a-b;
	}
	
	public static Double mul(double a ,double b) {
		return a*b;
	}
	
	public static Double div(double a ,double b) {
		return a/b;
	}

}
