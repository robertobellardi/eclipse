package com.doters.webpokedex.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doters.webpokedex.entities.Pokemon;
import com.doters.webpokedex.repository.PokemonRepository;

@Service
public class PokemonService implements IPokemonService {

	@Autowired
	private PokemonRepository repo;

	@Override
	public List<Pokemon> trovaTutti() {
		return repo.findAll();
	}
	
	@Override
	public Pokemon trovaUno(int id) {
		return repo.findById(id).get();
	}
}