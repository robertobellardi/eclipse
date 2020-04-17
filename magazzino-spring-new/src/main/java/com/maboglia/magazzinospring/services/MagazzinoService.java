package com.maboglia.magazzinospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.magazzinospring.entities.Magazzino2;
import com.maboglia.magazzinospring.repositories.MagazzinoRepository;

@Service
public class MagazzinoService implements IMagazzinoService {

	@Autowired
	private MagazzinoRepository repo;
	
	@Override
	public Magazzino2 salvaMagazzino(Magazzino2 m) {
		return repo.save(m);
	}

	@Override
	public List<Magazzino2> trovaTutti() {
		return repo.findAll();
	}

	@Override
	public Magazzino2 trovaUno(int id) {
//		return repo.getOne(id);
		return repo.findById(id).get();
	}

	@Override
	public Magazzino2 updateMagazzino(Magazzino2 m) {
		return repo.save(m);
	}

	@Override
	public void deleteMagazzino(Magazzino2 m) {
		repo.delete(m);
	}

}
