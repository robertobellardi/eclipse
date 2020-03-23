package com.maboglia.magazzinospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.magazzinospring.entities.Magazzino;

public interface MagazzinoRepository extends JpaRepository<Magazzino, Integer> {

}
