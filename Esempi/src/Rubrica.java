
public class Rubrica {
	
	private Contatto[] voci;
	private String nomeRubrica;
	private int indice=0 , max=0;
	
	public Rubrica(int numero) {
		nomeRubrica="nomeDefault";
		voci=new Contatto[numero];
		indice=0;
		max=numero;
	}
	
	public Rubrica(int numero,String nome) {
		nomeRubrica=nome;
		voci=new Contatto[numero];
		indice=0;
		max=numero;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getIndice() {
		return indice;
	}
	
	
	public void aggiungiVoci(String nome, String numero) {	
		if(controlloUtente(nome, numero)) {
			if(indice<max) {
				aggiungiVoce(nome, numero);
			}
			else {
				espandi();
				aggiungiVoce(nome, numero);			
			}
		}
	}
	
	public boolean controlloUtente(String nome,String numero) {
		boolean okay=true;
		
		for(int i=0;i<indice && okay;i++) {
			if((voci[i].getNome().equalsIgnoreCase(nome) && voci[i].getNumero().equals(numero)) || voci[i].getNumero().equals(numero))
				okay=false;
		}
		return okay;
	}
	
	public void aggiungiVoce(String nome,String numero) {
		voci[indice]=new Contatto(nome,numero);
		indice++;
	}
	
	public Contatto[] elencoVoci() {
		return voci;
	}
	
	public String toString() {
		String s="Nome rubrica : "+nomeRubrica+"\n";
		for(int i=0;i<indice;i++) {
			s+="\nVoce "+(i+1)+"\n"+voci[i];
		}
		return s;
	}
	
	public void espandi() {
		Contatto[] newVoci=new Contatto[max*2];
		for(int i=0;i<max;i++)
			newVoci[i]=voci[i];
		max*=2;
		voci=newVoci;
	}
}
