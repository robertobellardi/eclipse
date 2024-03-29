package com.bellardi.serieTV.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bellardi.serieTV.entities.Film;
import com.bellardi.serieTV.repositories.FilmRepository;

@Service
public class FilmService implements IFilmService {

	@Autowired
	private FilmRepository repo;

	@Override
	public Film salvaSerie(Film f) {
		return repo.save(f);
	}

	@Override
	public List<Film> trovaTutti() {
		return repo.findAll();
	}

	@Override
	public Film trovaUno(int id) {

		return repo.findById(id).get();
	}	
}