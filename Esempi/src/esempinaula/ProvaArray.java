package esempinaula;

public class ProvaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array di primitivi");
		int pos=-1;
		int i=0;
		int[] voti= {22,25,30,29,25};
		for(i=0;i<voti.length;i++) {
			System.out.print(voti[i]+" ");
		}
		System.out.println();
		
		System.out.println("\nOrdine inverso");
		for(i=voti.length-1;i>=0;i--) {
			System.out.print(voti[i]+" ");
		}
				
		for(i=0;i<voti.length;i++) {
			if(voti[i]==25) {
				pos=i;
				i=voti.length;
			}
		}
		System.out.println("Posizione di '25' = "+pos);
		
		System.out.println("\nArray di stringhe");
		String[] nani= {"Eolo","Dotto","Gongolo","Pisolo","Brontolo","Cucciolo","Mammolo"};
		for (String nano : nani) {
			System.out.print(nano+" ");
		}
		System.out.println();
		
		System.out.println("\nArray di interi riempito automaticamente");
		int[] numeri=new int[10];
		for(i=0;i<numeri.length;i++) {
			numeri[i]=i*10+10;
		}
		
		for(i=0;i<numeri.length;i++) {
			System.out.print(numeri[i]+" ");
		}
		System.out.println();
		
		System.out.println("\nCopia array riempito automaticamente");
		int[] destinazione=new int[5];
		for(i=0;i<destinazione.length && i+5<numeri.length;i++) {
			destinazione[i]=numeri[i+5];
			System.out.print(destinazione[i]+" ");
		}
		System.out.println();
		
		
	}

}
