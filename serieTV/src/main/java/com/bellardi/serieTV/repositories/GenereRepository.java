package com.bellardi.serieTV.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bellardi.serieTV.entities.Genere;

public interface GenereRepository extends JpaRepository<Genere, Integer> {

}
