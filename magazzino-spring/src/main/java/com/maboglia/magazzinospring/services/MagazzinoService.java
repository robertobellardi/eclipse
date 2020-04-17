package com.maboglia.magazzinospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.magazzinospring.entities.Magazzino;
import com.maboglia.magazzinospring.repositories.MagazzinoRepository;

@Service
public class MagazzinoService implements IMagazzinoService {

	@Autowired
	private MagazzinoRepository repo;
	
	@Override
	public Magazzino salvaMagazzino(Magazzino m) {
		return repo.save(m);
	}

	@Override
	public List<Magazzino> trovaTutti() {
		return repo.findAll();
	}

	@Override
	public Magazzino trovaUno(int id) {
//		return repo.getOne(id);
		return repo.findById(id).get();
	}

	@Override
	public Magazzino updateMagazzino(Magazzino m) {
		return repo.save(m);
	}

	@Override
	public void deleteMagazzino(Magazzino m) {
		repo.delete(m);
	}

}
