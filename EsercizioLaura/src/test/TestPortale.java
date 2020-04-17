package test;

import controller.Portale;
import model.Applicazioni;
import model.Link;
import model.Testo;

public class TestPortale {

	public static void main(String[] args) {
		 
		Portale portale = Portale.getPortale();
		portale.addElement(new Applicazioni("applicazione"));
		portale.addElement(new Link("link"));
		portale.addElement(new Testo("aaaaaaaa"));
		
		portale.pubblicaTutto(); 

	}
	

}
