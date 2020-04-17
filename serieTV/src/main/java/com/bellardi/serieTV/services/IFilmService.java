package com.bellardi.serieTV.services;

import java.util.List;

import com.bellardi.serieTV.entities.Film;


public interface IFilmService {

	//Create
	Film salvaSerie(Film f);
	
	//Retrieve
	List<Film> trovaTutti();
	Film trovaUno(int id);

}
