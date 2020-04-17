import java.util.ArrayList;

public class RubricaArrayList {

	private ArrayList<Contatto> voci;
	
	public RubricaArrayList() {
		voci=new ArrayList<>();
	}
	
	public ArrayList<Contatto> getArray(){
		return voci;
	}
	
	public void aggiungi(Contatto c) {
		if(!voci.contains(c))
			voci.add(c);
	}	
	
	public void remove(Contatto c) {
		voci.remove(c);
	}
	
	public String toString() {
		return voci.toString();
	}
	
	
}
