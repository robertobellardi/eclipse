package model;

import java.time.LocalDate;

public class Task {
	private String coseDaFare;
	private boolean isData;
	private LocalDate dataInizio,dataCOmpletamento;
	private String categoria;
	
	public Task(String s,String cat,LocalDate l) {
		coseDaFare=s;
		categoria=cat;
		isData=false;
		dataInizio=l;
		dataCOmpletamento=null;
	}
	
	public Task(String s,String cat) {
		coseDaFare=s;
		categoria=cat;
		isData=false;
		dataInizio=LocalDate.now();
		dataCOmpletamento=null;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String cat) {
		categoria = cat;
	}

	public String getCoseDaFare() {
		return coseDaFare;
	}

	public boolean isData() {
		return isData;
	}

	public LocalDate getDataCOmpletamento() {
		return dataCOmpletamento;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataCOmpletamento(LocalDate dataCOmpletamento) {
		this.dataCOmpletamento = dataCOmpletamento;
		this.isData=true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Categoria "+this.categoria+"\n")
		.append("Task "+this.coseDaFare+"\n")
		.append("Data inizio"+this.dataInizio+"\n");
		return sb.toString();
	}
	
	
	
}
