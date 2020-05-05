package com.doters.webpokedex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doters.webpokedex.entities.Mossa;
import com.doters.webpokedex.entities.Pokemon;
import com.doters.webpokedex.services.MosseService;
import com.doters.webpokedex.services.PokemonService;

@CrossOrigin
@RestController
@RequestMapping("/rest")
public class RestWebPokedexController {

	@Autowired
	private PokemonService pokeService;
	
	@Autowired
	private MosseService mosseService;
	
	@GetMapping("/Pokemons")
	public List<Pokemon> mostraPokemon() {
		return pokeService.trovaTutti();
	}
	
	@GetMapping("/Mosse")
	public List<Mossa> mostraMosse() {
		return mosseService.trovaTutti();
	}
}