package com.bellardi.agenaSpring.services;

import java.util.List;

import com.bellardi.agenaSpring.entities.Appuntamenti;

public interface IAppuntamentiService {
	
	//Create
	Appuntamenti salvaAppuntamento(Appuntamenti a);
	
	//Retrieve
	List<Appuntamenti> trovaTutti();
}