package com.bellardi.agenaSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class FilmRestController {
/*
	@Autowired
	private FilmService service;
	
	@Autowired
	private GenereService genereService;
	
	@Autowired
	private FilmRepository repo;

	@RequestMapping("/elencoSerie")
	public List<Film> mostraSerie(ModelMap map) {
		return service.trovaTutti();
	}
	
	@RequestMapping("/elencoGenere")
	public List<Genere> mostraGeneri(ModelMap map) {
		 return genereService.trovaTutti();
	}
	
	@RequestMapping("/aggiungiSerie")
	public void aggiungiSerie(@ModelAttribute("film") Film f, ModelMap map) {
		service.salvaSerie(f);
	}
	
	@RequestMapping("/visualizzaSerie")
	public Film visualizzaSerie(@RequestParam("id") int id, ModelMap map) {
		return service.trovaUno(id);
	}*/
}