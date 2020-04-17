package view;

import java.util.Scanner;

import controller.Registro;

public class ProvaRegistro {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Registro r=new Registro();
		
		for(int i=0;i<r.getRegistro().size();i++) {
			String risposta=getInput("E presente "+r.getRegistro().get(i));
			if(risposta.equalsIgnoreCase("s"))
				r.getPresenti().add(r.getRegistro().get(i));
			else
				r.getAssenti().add(r.getRegistro().get(i));
		}
		sc.close();
		
		System.out.println("Registro "+r.getRegistro());
		System.out.println("Presenti "+r.getPresenti());
		System.out.println("Assenti "+r.getAssenti());
		

	}
	
	private static String getInput(String domanda) {
		String risposta=null;
		System.out.println(domanda+" S/N ?");
		risposta=sc.nextLine();
		return risposta;		
	}

}
