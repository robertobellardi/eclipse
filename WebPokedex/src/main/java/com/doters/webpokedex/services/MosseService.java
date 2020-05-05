package com.doters.webpokedex.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doters.webpokedex.entities.Mossa;
import com.doters.webpokedex.repository.MosseRepository;

@Service
public class MosseService implements IMosseService {
	
	@Autowired
	private MosseRepository repo;
	

	@Override
	public List<Mossa> trovaTutti() {
		return repo.findAll();
	}	
}
