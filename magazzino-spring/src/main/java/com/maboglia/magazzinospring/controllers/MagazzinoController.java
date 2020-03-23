package com.maboglia.magazzinospring.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maboglia.magazzinospring.entities.Magazzino;
import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.services.MagazzinoService;
import com.maboglia.magazzinospring.services.ProdottiService;

@Controller
public class MagazzinoController {

	@Autowired
	private MagazzinoService service;
	
	@RequestMapping("/magazzino")
	public String mostraMagazzino(ModelMap map) {
		
		List<Magazzino> movimenti = service.trovaTutti();
		
		map.addAttribute("movimenti", movimenti);
		
		return "magazzino";
	}
	
	@RequestMapping("/addMagazzino")
	public String vistaAggiungiMagazzino() {
		return "addMagazzino";
	}
	
	@RequestMapping("/aggiungiMagazzino")
	public String aggiungiMagazzino(@ModelAttribute("magazzino") Magazzino m, ModelMap modelMap) {

		service.salvaMagazzino(m);
		
		modelMap.addAttribute("messaggio", "magazzino modificato");
		
		return "addMagazzino";
	}
	
	
	
	@RequestMapping("/deleteMagazzino")
	public String deleteMagazzino(@RequestParam("id") int id, ModelMap map) {
		
		Magazzino temp = service.trovaUno(id);
		
		service.deleteMagazzino(temp);
		map.addAttribute("messaggio", "Movimento eliminato");
		
		List<Magazzino> movimenti = service.trovaTutti();
		map.addAttribute("movimenti", movimenti);
		return "magazzino";
		
	}
	
	/**
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping("/updateMagazzino")
	public String aggiungiMagazzino(@RequestParam("id") int id, ModelMap map) {
		
		Magazzino temp = service.trovaUno(id);
		map.addAttribute("magazzino", temp);
		
		return "updMagazzino";
	}	
	
	@RequestMapping("/modificaMagazzino")
	public String modificaMagazzino(@ModelAttribute("magazzino") Magazzino m, ModelMap modelMap) {
		service.updateMagazzino(m);
		
		modelMap.addAttribute("messaggio", "movimento modificato con successo");

		List<Magazzino> movimenti = service.trovaTutti();
		modelMap.addAttribute("movimenti", movimenti);
		
		return "magazzino";
	}	
}