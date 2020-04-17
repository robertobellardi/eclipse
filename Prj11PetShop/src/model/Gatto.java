package model;

public class Gatto extends Animale{

	public Gatto() {
		this.setNome("Gatto");	
	}
	
	
	@Override
	public void mangia(Commestibile c) {
		if(c instanceof Secco)
			if(((Secco)c).getQuantita()>0.2)
				this.setSoddisfazione(true);
			else
				this.setSoddisfazione(false);	
		
		if(c instanceof Umido)
			if(((Umido)c).getQuantita()>0.2)
				this.setSoddisfazione(true);
			else
				this.setSoddisfazione(false);
		
		if(c instanceof Topo)
			if(!((Topo)c).isMorto())
				this.setSoddisfazione(true);
			else
				this.setSoddisfazione(false);
	}

	@Override
	public boolean isSoddisfatto(boolean b) {
		return b;
	}

}
