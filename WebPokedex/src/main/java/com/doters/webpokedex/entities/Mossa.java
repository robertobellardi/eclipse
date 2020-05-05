package com.doters.webpokedex.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mosse")
public class Mossa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany
	@JoinTable(
		name = "mosse_pokemon",
		joinColumns = @JoinColumn(name = "mosse_id"),
		inverseJoinColumns = @JoinColumn(name = "pokemon_id"))
	private List<Pokemon2> listaPokemon;
	
	private String nome, tipo;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Pokemon2> getListaPokemon() {
		return this.listaPokemon;
	}

	public void setListaPokemon(List<Pokemon2> listaPokemon) {
		this.listaPokemon = listaPokemon;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
}
