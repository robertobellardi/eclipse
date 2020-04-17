package com.bellardi.serieTV.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bellardi.serieTV.entities.Film;
import com.bellardi.serieTV.entities.Genere;
import com.bellardi.serieTV.repositories.FilmRepository;
import com.bellardi.serieTV.services.FilmService;
import com.bellardi.serieTV.services.GenereService;

@Controller
public class FilmController {

	@Autowired
	private FilmService service;
	
	@Autowired
	private GenereService genereService;
	
	@Autowired
	private FilmRepository repo;
		
	@RequestMapping(value= {"/","home"})
	public String mostraHome() {
		return "index";	
	}
	
	@RequestMapping("/inserisciSerie")
	public String mostraForm(ModelMap map) {
		List<Genere> generi = genereService.trovaTutti();
		map.addAttribute("generi", generi);
		
		return "inserisciSerie";	
	}	

	@RequestMapping("/elencoSerie")
	public String mostraSerie(ModelMap map) {
		List<Film> lista = service.trovaTutti();
		map.addAttribute("lista", lista);
		
		return "listaSerie";
	}
	
	@RequestMapping("/elencoGenere")
	public String mostraGeneri(ModelMap map) {
		List<Genere> generi = genereService.trovaTutti();
		map.addAttribute("generi", generi);
		
		return "listaGeneri";
	}
	
	@RequestMapping("/aggiungiSerie")
	public String aggiungiSerie(@ModelAttribute("film") Film f, ModelMap map) {
		service.salvaSerie(f);
				
		return mostraSerie(map);
	}
	
	@RequestMapping("/visualizzaSerie")
	public String visualizzaSerie(@RequestParam("id") int id, ModelMap map) {
		Film f=service.trovaUno(id);
		map.addAttribute("film", f);
		
		return "visualizzaSerie";
	}
}