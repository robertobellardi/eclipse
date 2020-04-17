package esempinaula;

public class SerieFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int nFib=92;
		long somma=0, a=1 , b=1;
		
		for(int i=2;i<nFib;i++) {
			somma=a+b;
			a=b;
			b=somma;
			System.out.println(somma);
		}
		System.out.println("Somma è : "+somma);
			
		
		
		
	}

}
