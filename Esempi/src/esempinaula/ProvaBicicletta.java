package esempinaula;

public class ProvaBicicletta {

	public static void main(String[] args) {
		Bicicletta b1=new Bicicletta(1000.0,"Specialized","nero");
		Bicicletta b2=b1;
		Bicicletta b3=new Bicicletta(1000.0,"Specialized","nero");
		b1.setColore("verde lime");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
