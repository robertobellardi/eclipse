package esempinaula;

public class ProvaContatore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contatore cont=new Contatore();
		cont.incrementa();
		cont.incrementa();
		cont.incrementa();
		cont.incrementa();
		cont.decrementa();
		System.out.println("Contatore vale :"+cont);
	}

}
