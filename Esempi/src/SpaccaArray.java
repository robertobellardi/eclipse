
public class SpaccaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int []numeri={1,2,3,4};
		String []note={"qwe","rty","asd","dfg"};

		for(int i=0;i<numeri.length;i++)
			System.out.println("Cella : "+i+" valore : "+numeri[i]);
		
		for(int i=0;i<note.length;i++)
			System.out.println("Cella : "+i+" valore : "+note[i]);
		
		try {
			System.out.println(numeri[7]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Eccezione");
		}
		*/
		//System.out.println(numeri[4]);
		
		String[] settimana= {"Lunedì","Martedì","Mercoledì","Giovedì","Venerdì","Sabato","Domenica"};
		int[] ore=new int[8];
		
		for(int i=0;i<ore.length;i++)
			ore[i]=i+8;
		
		for(int i=0;i <settimana.length;i++) {
			System.out.print(settimana[i]);
			for(int j=0;j<ore.length;j++)
				System.out.print("-"+ore[j]);
			System.out.println();
		}
		
	}

}
