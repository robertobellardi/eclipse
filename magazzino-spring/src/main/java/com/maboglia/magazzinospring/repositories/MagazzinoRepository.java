package com.maboglia.magazzinospring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maboglia.magazzinospring.entities.Magazzino;

public interface MagazzinoRepository extends JpaRepository<Magazzino, Integer> {

	@Query("SELECT idProdotto, sum(quantita) FROM Magazzino group by idProdotto")
	public List<Object[]> statoMagazzino();
	
}
