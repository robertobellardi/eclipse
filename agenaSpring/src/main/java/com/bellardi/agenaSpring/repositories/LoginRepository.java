package com.bellardi.agenaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bellardi.agenaSpring.entities.Utente;

public interface LoginRepository extends JpaRepository<Utente, Integer> {

}
