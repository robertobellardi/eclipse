package collezioni;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProvaSet {

	public static void main(String[] args) {
		String[] chiavi= {"10","9"};
		Set<String> chiavi1=new TreeSet<>();
		Set<String> chiavi2=new HashSet<>();
		
		for(int i=0;i<chiavi.length;i++) {
			chiavi1.add(chiavi[i]);
			chiavi2.add(chiavi[i]);
		}
		
		System.out.println(chiavi1);
		System.out.println(chiavi2);
	}

}
