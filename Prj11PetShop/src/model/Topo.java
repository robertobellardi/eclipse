package model;

public class Topo extends Animale implements Commestibile{

	public Topo() {
		this.setNome("Topo");	
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
			this.setSoddisfazione(false);
	}

	@Override
	public boolean isSoddisfatto(boolean b) {
		return b;
	}

	@Override
	public boolean isMorto() {
		return false;
	}

}
