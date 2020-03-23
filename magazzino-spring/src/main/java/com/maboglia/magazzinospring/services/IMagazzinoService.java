package com.maboglia.magazzinospring.services;

import java.util.List;

import com.maboglia.magazzinospring.entities.Magazzino;


public interface IMagazzinoService {

	//Create
	Magazzino salvaMagazzino(Magazzino m);
	
	//Retrieve
	List<Magazzino> trovaTutti();
	Magazzino trovaUno(int id);
	
	//Update
	Magazzino updateMagazzino(Magazzino m);
	
	//Delete
	void deleteMagazzino(Magazzino p);
}
