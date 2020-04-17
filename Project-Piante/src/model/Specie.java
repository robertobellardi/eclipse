package model;

public enum Specie {
	
	PINO("Si bagna con la pioggia",1.5) , MELO("si bagna con l'idrante",2.5) ;
	
	private String metodoIrrigazione;
	private Double qtAcqua;
	
	private Specie(String metIr,double qtA) {
		this.metodoIrrigazione=metIr;
		this.qtAcqua=qtA;		
	}
	
	public String getMetodoIrrigazione() {
		return metodoIrrigazione;
	}

	public void setMetodoIrrigazione(String metodoIrrigazione) {
		this.metodoIrrigazione = metodoIrrigazione;
	}

	public Double getQtAcqua() {
		return qtAcqua;
	}

	public void setQtAcqua(Double qtAcqua) {
		this.qtAcqua = qtAcqua;
	}
	
	@Override
	public String toString() {
		return metodoIrrigazione + ": "+qtAcqua+": ";
		
	}
}