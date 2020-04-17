package com.bellardi.serieTV.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bellardi.serieTV.entities.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}
