package com.maboglia.magazzinospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.services.ProdottiService;

@RestController
@RequestMapping("/rest")
public class MagazzinoRestController {

	@Autowired
	private ProdottiService service;
	
	@GetMapping
	public List<Prodotto> getProdotti(){
		return service.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Prodotto getProdotto(@PathVariable("id") int id) {
		return service.trovaUno(id);
	}
	
	@PostMapping
	public Prodotto aggiungiProdotto(@RequestBody Prodotto p) {
		return service.salvaProdotto(p);
	}
	
	@PutMapping
	public Prodotto aggiornaProdotto(@RequestBody Prodotto p) {
		return service.salvaProdotto(p);
	}
	
	@DeleteMapping
	public void eliminaProdotto(@RequestBody Prodotto p) {
		service.deleteProdotto(p);
	}
	
}
