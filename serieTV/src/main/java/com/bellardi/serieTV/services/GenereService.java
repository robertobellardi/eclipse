package com.bellardi.serieTV.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bellardi.serieTV.entities.Genere;
import com.bellardi.serieTV.repositories.GenereRepository;


@Service
public class GenereService implements IGenereService {

	@Autowired
	private GenereRepository repo;

	@Override
	public List<Genere> trovaTutti() {
		return repo.findAll();
	}	
}