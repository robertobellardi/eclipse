package collezioni;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProvaMappa {

	public static void main(String[] args) {
		Map<Integer,String> risultati=new HashMap<>();
		
		risultati.put(1, "rossi");
		risultati.put(2, "marquez");
		risultati.put(3, "vinales");
		risultati.put(4, "dovizioso");

		System.out.println(risultati);
		
		Set<Integer> chiavi=risultati.keySet();
	}

}
