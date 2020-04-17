package esempinaula;

public class ProvaStudente {
	
	public static void main(String[] args) {
		Studente[] al= {new Studente("Roberto", "Bellardi gioli", 25, 24, 06, 1994,2,5)};
		for(int i=0;i<al.length;i++)
			System.out.println(i +"\n"+al[i]+"\n");
		System.out.println("Eta : "+al[0].calcolataEta());
		System.out.println("Firma : "+al[0].sign());
		
	}

}
