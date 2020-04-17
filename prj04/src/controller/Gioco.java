package controller;

import model.Dado;

public class Gioco {
	
	private int[] cont;
	private int uguali=0;;
	private Dado d1,d2;
	
	public Gioco() {
		this.cont=new int[6];
		for(int i=0;i<6;i++)
			cont[i]=0;
		this.d1 = new Dado("bianco",6);
		this.d2 = new Dado("bianco",6);
	}
	
	public int[] getCont() {
		return cont;
	}

	public int getUguali() {
		return uguali;
	}

	public String gioca(int nVolte) {
		for(int i=0;i<nVolte;i++) {
			d1.lancia();
			d2.lancia();
			if(d1.getValoreDado() == d2.getValoreDado()) {
				uguali++;
				switch(d1.getValoreDado()) {
				
				case 1:
					cont[0]++;
					break;
				case 2:
					cont[1]++;
					break;
				case 3:
					cont[2]++;
					break;
				case 4:
					cont[3]++;
					break;
				case 5:
					cont[4]++;
					break;
				case 6:
					cont[5]++;
					break;				
				}				
			}			
		}
				
		return "Numero di volte uguali ---> "+uguali+"\nnumeri di 1 ---> "+cont[0]+
				"\nnumeri di 2 ---> "+cont[1]+"\nnumeri di 3 ---> "+cont[2]+
				"\nnumeri di 4 ---> "+cont[3]+"\nnumeri di 5 ---> "+cont[4]+
				"\nnumeri di 6 ---> "+cont[5];
	}

	public Dado getD1() {
		return d1;
	}

	public void setD1(Dado d1) {
		this.d1 = d1;
	}

	public Dado getD2() {
		return d2;
	}

	public void setD2(Dado d2) {
		this.d2 = d2;
	}

	
}
