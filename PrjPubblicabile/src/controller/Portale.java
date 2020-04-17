package controller;

import java.util.ArrayList;
import model.Pubblicabile;

public class Portale {	

	private ArrayList<Pubblicabile> portale;
	private int numeElement;
	
	private static final Portale instance = new Portale();
	
	private Portale() {
		portale=new ArrayList<>();
	}
	
	public static Portale getInstance(){
        return instance;
    }
	
	public void addElement(Pubblicabile app) {
		numeElement++;
		portale.add(app);
	}
	
	public void pubblicaTutto() {
		for(int i=0;i<numeElement;i++)
			portale.get(i).pubblica();
	}
	
	public ArrayList<Pubblicabile>getPortale(){
		return portale;
	}
	
}
