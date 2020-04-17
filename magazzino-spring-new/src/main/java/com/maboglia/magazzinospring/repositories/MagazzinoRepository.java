package com.maboglia.magazzinospring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maboglia.magazzinospring.entities.Magazzino2;

public interface MagazzinoRepository extends JpaRepository<Magazzino2, Integer> {

	@Query("SELECT prodotto.id, sum(quantita) FROM Magazzino2 group by prodotto.id")
	public List<Object[]> statoMagazzino();
	
	@Query("SELECT sum(quantita) FROM Magazzino2")
	public Object statoMagazzinoSomma();
	
	
	
}
