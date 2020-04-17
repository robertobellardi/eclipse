package com.maboglia.magazzinospring.services;

import java.util.List;

import com.maboglia.magazzinospring.entities.Prodotto;

public interface IProdottiService {

	//Create
	Prodotto salvaProdotto(Prodotto p);
	
	//Retrieve
	List<Prodotto> trovaTutti();
	Prodotto trovaUno(int id);
	
	//Update
	Prodotto updateProdotto(Prodotto p);
	
	//Delete
	void deleteProdotto(Prodotto p);
}
