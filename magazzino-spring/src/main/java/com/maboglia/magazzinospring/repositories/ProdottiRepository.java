package com.maboglia.magazzinospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.magazzinospring.entities.Prodotto;


public interface ProdottiRepository extends JpaRepository<Prodotto, Integer> {

}
