package esempinaula;

public class Caramelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int barattolo1=120;
		int barattolo2=barattolo1;
		
		System.out.println("Barattolo1 : "+barattolo1);
		System.out.println("Barattolo2 : "+barattolo2);
		System.out.println("Barattolo1 == Barattolo? => "+ (barattolo1==barattolo2));

		
		barattolo1-=100;
		
		System.out.println("\nBarattolo1 : "+barattolo1);
		System.out.println("Barattolo2 : "+barattolo2);
		
		System.out.println("Barattolo1 == Barattolo? => "+ (barattolo1==barattolo2));
		
	}

}
