package controller;

import java.util.List;

import model.Animale;
import model.Cane;
import model.Commestibile;
import model.Gatto;
import model.Topo;

public class RifugioAnimali {

	private List<Animale> rifugioAnimali;
	
	private RifugioCani rC;
	private RifugioGatti rG;
	private RifugioTopi rT;

	public RifugioAnimali(List<Animale> rifugioAnimali) {
		this.rifugioAnimali = rifugioAnimali;
		
		rC=new RifugioCani();
		rG=new RifugioGatti();
		rT=new RifugioTopi();
		
		for (Animale animale : rifugioAnimali) {
			if(animale instanceof Cane) {
				rC.add((Cane)animale);
			}
			else if(animale instanceof Gatto) {
				rG.add((Gatto)animale);
			}else {
				rT.add((Topo)animale);
			}
				
		}
		
	}
	
	public void daiCibo(Commestibile c) {
		for (Animale animale : rifugioAnimali) {
			animale.mangia(c);
		}
	}

	public List<Animale> getRifugioAnimali() {
		return rifugioAnimali;
	}

	public void setRifugioAnimali(List<Animale> rifugioAnimali) {
		this.rifugioAnimali = rifugioAnimali;
	}
	
	
}
