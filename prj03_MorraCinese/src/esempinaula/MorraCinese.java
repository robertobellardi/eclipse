package esempinaula;

import java.util.Random;
import java.util.Scanner;

public class MorraCinese {
	static Scanner sc=new Scanner(System.in);
	static String[] scelte= {"carta","forbice","sasso"};
/*
	public static void main(String[] args) {
		int a=sceltaUtente();
		if(a>0 && a<3)
			risultato(a,sceltaComputer());
		else
			System.out.println("Input non valido");
	}
*/	
	public static int sceltaUtente() {
		System.out.println("Scegli tra :");
		System.out.println("1 ---> carta");
		System.out.println("2 ---> forbice");
		System.out.print("3 ---> sasso : ");
		if(sc.hasNextInt())
			return (Integer.parseInt(sc.nextLine())-1);
		else 
			return -1;
	}
	
	public static int sceltaComputer() {
		Random r=new Random();
		return r.nextInt(3);
	}
	
	public static String risultato(int a,int b) {
		String s="";
		if(a==b)
			s+="Pareggio";
		else if(a == 0 && b == 1)
			s+="Vince il PC";
		else if(a == 1 && b == 2)
			s+="Vince il PC";
		else if(a == 0 && b == 2)
			s+="Vince il giocatore";
		else if(a == 1 && b == 0)
			s+="Vince il giocatore";
		s+="\nGiocatore ---> "+scelte[a];
		s+="\nPc ---> "+scelte[b];
		return s;
	}

}
