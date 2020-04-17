package com.maboglia.magazzinospring.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "magazzino2")
public class Magazzino2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private Prodotto prodotto;
	
	private int quantita;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date data;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Prodotto getIdProdotto() {
		return prodotto;
	}
	public void setIdProdotto(Prodotto idProdotto) {
		this.prodotto = idProdotto;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Magazzino [id=" + id + ", prodotto=" + prodotto + ", quantita=" + quantita + ", data=" + data + "]";
	}

	
	
}
