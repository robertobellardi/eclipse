package com.doters.webpokedex.services;

import java.util.List;

import com.doters.webpokedex.entities.Pokemon;

public interface IPokemonService {
	
	//Retrieve
	List<Pokemon> trovaTutti();
	
	Pokemon trovaUno(int id);
}
