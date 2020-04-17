
public class ProvaRubricaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RubricaArrayList ral=new RubricaArrayList();
		Contatto c1= new Contatto("Roberto","3482352963");
		ral.aggiungi(c1);
		ral.aggiungi(c1);
		ral.aggiungi(c1);
		ral.aggiungi(new Contatto("Roberto","3482352963"));
		ral.aggiungi(new Contatto("Roberto","3482352963"));
		System.out.println(ral);
	}

}
