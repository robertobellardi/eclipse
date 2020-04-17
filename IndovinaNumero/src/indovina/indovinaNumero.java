package indovina;

import java.util.Scanner;

public class indovinaNumero {

	static int conTentativi=0;
	static int numero=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rand=(int)(Math.floor(Math.random()*100)+1);
		int indovina=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Indovina il numero tra 1 e 100 :");
		indovina=sc.nextInt();
		
		while(conTentativi<10 && indovina!=rand) {
			if(indovina>rand)
				System.out.println("Numero troppo grande");
			else
				System.out.println("Numero troppo piccolo");
			System.out.print("Indovina il numero tra 1 e 100 :");
			indovina=sc.nextInt();	
			conTentativi++;
		}
		
		if(conTentativi<10)
			System.out.println("Complimenti hai indovinato in "+(conTentativi+1)+" tentativi");
		else
			System.out.println("Mi dispiace ma non hai indovinato");
		
		
		
		
		

	}

}
