package esempinaula;

public class Contatore {
	
	private int valore;
	
	public Contatore() {
		valore=0;
	}
	
	public Contatore(int val) {
		valore=val;
	}
	
	public void incrementa() {
		valore++;
	}
	
	public void decrementa() {
		valore--;
	}
	
	public String toString() {
		return " "+valore+" ";
	}

}
