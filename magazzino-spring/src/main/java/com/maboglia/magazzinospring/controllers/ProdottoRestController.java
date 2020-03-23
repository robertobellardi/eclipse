package com.maboglia.magazzinospring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.services.ProdottiService;

@RestController
@RequestMapping("/rest")
public class ProdottoRestController {

	@Autowired
	private ProdottiService service;
	
	@GetMapping
	public List<Prodotto> getProdotti(){
		return service.trovaTutti();
	}
	
	@PostMapping
	public Prodotto aggiungiProdotto(@RequestBody Prodotto p) {
		return service.salvaProdotto(p);
	}
	
}
