package controller;

import java.util.HashSet;
import java.util.Set;

import model.Gatto;

public class RifugioGatti {

	Set<Gatto> elencoGatti = new HashSet<>();	
	
	public void add(Gatto g) {
		elencoGatti.add(g);
	}
}
