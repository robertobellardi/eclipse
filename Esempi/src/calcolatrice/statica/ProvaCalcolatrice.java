package calcolatrice.statica;

public class ProvaCalcolatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numeriUtente=InterfacciaUtente.chiediDueNumeri();
		
		Calcolatrice.a=numeriUtente[0];
		Calcolatrice.b=numeriUtente[1];
		
		System.out.println("Addizione = "+ Calcolatrice.addizione());
		
		
		
	}

}
