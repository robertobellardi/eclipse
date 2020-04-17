package com.maboglia.magazzinospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.magazzinospring.entities.Magazzino2;
import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.services.MagazzinoService;
import com.maboglia.magazzinospring.services.ProdottiService;

@RestController
@RequestMapping("/magazzinorest")
public class MagazzinoRestController {

	@Autowired
	private MagazzinoService service;
	
	@CrossOrigin
	@GetMapping
	public List<Magazzino2> getMagazzino(){
		return service.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Magazzino2 getMagazzino(@PathVariable("id") int id) {
		return service.trovaUno(id);
	}
	
	@PostMapping
	public Magazzino2 aggiungiMagazzino(@RequestBody Magazzino2 m) {
		return service.salvaMagazzino(m);
	}
	
	@PutMapping
	public Magazzino2 aggiornaProdotto(@RequestBody Magazzino2 m) {
		return service.salvaMagazzino(m);
	}
	
	@DeleteMapping
	public void eliminaMagazzino(@RequestBody Magazzino2 m) {
		service.deleteMagazzino(m);
	}
	
}
