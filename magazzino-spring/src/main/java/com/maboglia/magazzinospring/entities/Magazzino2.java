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
@Table(name = "magazzino")
public class Magazzino2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private Prodotto idprodotto;
	
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
		return idprodotto;
	}
	public void setIdProdotto(Prodotto idprodotto) {
		this.idprodotto = idprodotto;
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
		return "Magazzino [id=" + id + ", idProdotto=" + idprodotto + ", quantita=" + quantita + ", data=" + data + "]";
	}

	
	
}
