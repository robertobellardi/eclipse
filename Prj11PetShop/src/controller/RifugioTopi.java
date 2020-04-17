package controller;

import java.util.LinkedList;
import java.util.List;

import model.Topo;

public class RifugioTopi {

	List<Topo> elencoTopi = new LinkedList<>();
	
	public void add(Topo t) {
		elencoTopi.add(t);
	}
}
