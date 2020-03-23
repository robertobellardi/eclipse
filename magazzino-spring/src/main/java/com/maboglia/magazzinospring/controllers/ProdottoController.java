package com.maboglia.magazzinospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.services.ProdottiService;

@Controller
public class ProdottoController {

	@Autowired
	private ProdottiService service;
	
	@RequestMapping("/prodotti")
	public String mostraProdotti(ModelMap map) {
		
		List<Prodotto> prodotti = service.trovaTutti();
		map.addAttribute("prodotti", prodotti);
		return "prodotti";
	}
	
	@RequestMapping("/addProdotti")
	public String vistaAggiungiProdotti() {
		return "addProdotti";
	}
	
	@RequestMapping("/aggiungiProdotto")
	public String aggiungiProdotto(@ModelAttribute("prodotto") Prodotto p, ModelMap modelMap) {
		service.salvaProdotto(p);
		
		modelMap.addAttribute("messaggio", "prodotto salvato");
		
		return "addProdotti";
	}
	
	@RequestMapping("/deleteProdotto")
	public String deleteProdotto(@RequestParam("id") int id, ModelMap map) {
		
		Prodotto temp = service.trovaUno(id);
		//Prodotto temp = new Prodotto(); temp.setId(id);
		service.deleteProdotto(temp);
		map.addAttribute("messaggio", "prodotto eliminato");
		
		List<Prodotto> prodotti = service.trovaTutti();
		map.addAttribute("prodotti", prodotti);
		return "prodotti";
		
	}
	
	
	@RequestMapping("/updateProdotto")
	public String aggiungiProdotti(@RequestParam("id") int id, ModelMap map) {
		
		Prodotto temp = service.trovaUno(id);
		map.addAttribute("prodotto", temp);
		
		return "updProdotti";
	}	
	
	@RequestMapping("/modificaProdotto")
	public String modificaProdotto(@ModelAttribute("prodotto") Prodotto p, ModelMap modelMap) {
		service.updateProdotto(p);
		
		modelMap.addAttribute("messaggio", "prodotto modificato con successo");

		List<Prodotto> prodotti = service.trovaTutti();
		modelMap.addAttribute("prodotti", prodotti);
		
		return "prodotti";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
