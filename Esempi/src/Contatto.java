
public class Contatto {
	
	private String nome;
	private String numero;

	public Contatto(String nome,String numero) {
		// TODO Auto-generated constructor stub
		this.nome=nome;
		this.numero=numero;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNumero() {
		return numero;
	}
	
	
	public String toString() {
		return "[Nome\t:"+nome+"]\n[Numero\t:"+numero+"]\n";
	}

}
