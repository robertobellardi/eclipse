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
@Table(name = "pokemon")
public class Pokemon2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany(mappedBy = "listaPokemon")
	private List<Mossa> listaMosse;
	
	private String nome, tipo1, tipo2, img;
	
	private int totale, salute, attacco , difesa, attaccoSpeciale, difesaSpeciale, velocita;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getTotale() {
		return totale;
	}

	public void setTotale(int totale) {
		this.totale = totale;
	}

	public int getSalute() {
		return salute;
	}

	public void setSalute(int salute) {
		this.salute = salute;
	}

	public int getAttacco() {
		return attacco;
	}

	public void setAttacco(int attacco) {
		this.attacco = attacco;
	}

	public int getDifesa() {
		return difesa;
	}

	public void setDifesa(int difesa) {
		this.difesa = difesa;
	}

	public int getAttaccoSpeciale() {
		return attaccoSpeciale;
	}

	public void setAttaccoSpeciale(int attaccoSpeciale) {
		this.attaccoSpeciale = attaccoSpeciale;
	}

	public int getDifesaSpeciale() {
		return difesaSpeciale;
	}

	public void setDifesaSpeciale(int difesaSpeciale) {
		this.difesaSpeciale = difesaSpeciale;
	}

	public int getVelocita() {
		return velocita;
	}

	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}

	public void setListaMosse(List<Mossa> listaMosse) {
		this.listaMosse = listaMosse;
	}
	

}