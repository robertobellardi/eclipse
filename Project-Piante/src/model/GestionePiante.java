package model;

public class GestionePiante {

	public static void main(String[] args) {
		Pianta meloBonsai=new Bonsai();
		Pianta pinoBonsai=new Bonsai();
		
		meloBonsai.famiglia=Famiglie.ANGIOSPERME;
		pinoBonsai.famiglia=Famiglie.CONIFERE;
		
		meloBonsai.specie=Specie.MELO;
		pinoBonsai.specie=Specie.PINO;
	}

}
