package com.maboglia.magazzinospring.services;

import java.util.List;

import com.maboglia.magazzinospring.entities.Magazzino2;


public interface IMagazzinoService {

	//Create
	Magazzino2 salvaMagazzino(Magazzino2 m);
	
	//Retrieve
	List<Magazzino2> trovaTutti();
	Magazzino2 trovaUno(int id);
	
	//Update
	Magazzino2 updateMagazzino(Magazzino2 m);
	
	//Delete
	void deleteMagazzino(Magazzino2 p);
}
