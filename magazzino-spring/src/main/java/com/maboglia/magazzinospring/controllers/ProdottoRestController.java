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

import com.maboglia.magazzinospring.entities.Magazzino;
import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.services.MagazzinoService;
import com.maboglia.magazzinospring.services.ProdottiService;

@CrossOrigin
@RestController
@RequestMapping("/magazzinorest")
public class ProdottoRestController {

	@Autowired
	private MagazzinoService service;
	
	@GetMapping
	public List<Magazzino> getMagazzino(){
		return service.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Magazzino getMagazzino(@PathVariable("id") int id) {
		return service.trovaUno(id);
	}
	
	@PostMapping
	public Magazzino aggiungiMagazzino(@RequestBody Magazzino m) {
		return service.salvaMagazzino(m);
	}
	
	@PutMapping
	public Magazzino aggiornaProdotto(@RequestBody Magazzino m) {
		return service.salvaMagazzino(m);
	}
	
	@DeleteMapping
	public void eliminaMagazzino(@RequestBody Magazzino m) {
		service.deleteMagazzino(m);
	}
	
}
