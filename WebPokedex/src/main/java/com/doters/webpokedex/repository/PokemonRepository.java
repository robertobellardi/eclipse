package com.doters.webpokedex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.doters.webpokedex.entities.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
	/*
	@Query("SELECT pokemon.id, pokemon.nome, tipo1, tipo2, totale, salute, attacco,difesa, attacco_speciale,difesa_speciale,velocita, mosse.id, mosse.nome, mosse.tipo FROM pokemon JOIN mosse join mosse_pokemon WHERE pokemon.id=mosse_pokemon.pokemon_id and mosse_pokemon.mosse_id=mosse.id")
    public List<Pokemon> statoPokemon();
*/
}
