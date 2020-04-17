package model;

public class Cane extends Animale{
	
	public Cane() {
		this.setNome("Cane");	
	}

	@Override
	public void mangia(Commestibile c) {
		if(c instanceof Secco)
			if(((Secco)c).getQuantita()>0.5)
				this.setSoddisfazione(true);
			else
				this.setSoddisfazione(false);		
		
		if(c instanceof Umido)
			if(((Umido)c).getQuantita()>0.5)
				this.setSoddisfazione(true);
			else
				this.setSoddisfazione(false);
		
		if(c instanceof Topo)
			if(((Topo)c).isMorto())
				this.setSoddisfazione(true);
			else
				this.setSoddisfazione(false);
	}

	@Override
	public boolean isSoddisfatto(boolean b) {
		return b;
	}

}
