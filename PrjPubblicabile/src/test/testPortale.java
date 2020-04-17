package test;

import controller.Portale;
import model.Applicazione;
import model.Link;
import model.Testo;

public class testPortale {

	public static void main(String[] args) {

		Portale p=Portale.getInstance();
		p.addElement(new Testo("prova"));
		p.addElement(new Link("prova"));
		p.addElement(new Applicazione("prova"));
		Applicazione app=new Applicazione("nome");
		System.out.println(app.getClass()+"/");
		p.pubblicaTutto();
		System.out.println("Esco");
	}

}
