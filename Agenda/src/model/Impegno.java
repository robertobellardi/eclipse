package model;

import java.util.Date;

public class Impegno {
	
	private String argomento;
	private String luogo;
	private int priorita;
	private Date data;

	public Impegno(String argomento, String luogo, int priorita,Date data) {
		this.argomento = argomento;
		this.luogo = luogo;
		this.priorita = priorita;
		this.data=data;
	}

	public String getArgomento() {
		return argomento;
	}

	public void setArgomento(String argomento) {
		this.argomento = argomento;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public int getPriorita() {
		return priorita;
	}

	public void setPriorita(int priorita) {
		this.priorita = priorita;
	}
	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
