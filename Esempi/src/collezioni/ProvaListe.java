package collezioni;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ProvaListe {

	public static void main(String[] args) {
		String[] nanetti= {"pisolo","mammolo"};
		List<String> nani1=new ArrayList<>();
		List<String> nani2=new LinkedList<>();
		List<String> nani3=new Vector<>();

		
		for(int i=0;i<nanetti.length;i++) {
			nani1.add(nanetti[i]);
			nani2.add(nanetti[i]);
			nani3.add(nanetti[i]);
		}
		
		System.out.println(nani1);
		System.out.println(nani2);
		System.out.println(nani3 );
	
	
	}
	
}
