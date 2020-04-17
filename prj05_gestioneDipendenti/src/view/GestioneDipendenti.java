package view;

import controller.LibroMatricola;
import model.Fattorino;
import model.Impiegato;

public class GestioneDipendenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibroMatricola lb=new LibroMatricola();
		Fattorino f=new Fattorino("Marco","Aurelio");
		f.setNumConsegne(50);
		lb.addDipendente(f);
		Impiegato i =new Impiegato("Giulio","Cesare");
		i.setNOreLav(160);
		lb.addDipendente(i);
		System.out.println(lb);
	}

}
