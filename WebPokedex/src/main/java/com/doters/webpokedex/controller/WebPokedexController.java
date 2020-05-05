package com.doters.webpokedex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.doters.webpokedex.services.PokemonService;


@Controller
public class WebPokedexController {

	@Autowired
	private PokemonService pokeService;
		
	@RequestMapping(value= {"/","home"})
	public String mostraHome() {
		return "index";	
	}
	
	@RequestMapping("Pokemons")
	public String mostraPokemons(ModelMap map) {
		map.addAttribute("pokemons", pokeService.trovaTutti());
		return "mostraPokemons";	
	}
	
	@RequestMapping("cercaPokemon")
	public String mostraPokemon(@RequestParam("id") int id, ModelMap map) {
		System.out.println(id);
		map.addAttribute("pokemon", pokeService.trovaUno(id));
		return "mostraPokemon";	
	}
}