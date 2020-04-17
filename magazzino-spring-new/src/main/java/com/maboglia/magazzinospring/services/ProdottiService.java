package com.maboglia.magazzinospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.repositories.ProdottiRepository;

@Service
public class ProdottiService implements IProdottiService {

	@Autowired
	private ProdottiRepository repo;
	
	@Override
	public Prodotto salvaProdotto(Prodotto p) {

		return repo.save(p);
	}

	@Override
	public List<Prodotto> trovaTutti() {
		
		return repo.findAll();
	}

	@Override
	public Prodotto trovaUno(int id) {
		// TODO Auto-generated method stub
//		return repo.getOne(id);
		return repo.findById(id).get();
	}

	@Override
	public Prodotto updateProdotto(Prodotto p) {
		return repo.save(p);
	}

	@Override
	public void deleteProdotto(Prodotto p) {
		repo.delete(p);

	}

}
