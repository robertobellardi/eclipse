package todo;

import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoList {
	
	private ArrayList<ToDo> lista;
	private LocalDate data;
	private String nomeLista;

	public ToDoList(String nomeLista) {
		// TODO Auto-generated constructor stub
		lista=new ArrayList<ToDo>();
		data=LocalDate.now();
		this.nomeLista=nomeLista;
	}
	
	public String toString() {
		String stampa="\n"+nomeLista+" "+data.toString()+"\n";
		for(int i=0;i<lista.size();i++) {
			stampa+=i+" :"+lista.get(i).getToDo()+" "+lista.get(i).getQuantity()+"\n";
		}
		if(lista.size()==0)
			stampa+="Lista vuota\n";
		return stampa;
	}
	
	public boolean checkToDo(ToDo td) {
		boolean check=false;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getToDo().equalsIgnoreCase(td.getToDo()))
				check=true;
		}
		return check;
	}
	
	public int checkPosToDo(String td) {
		int pos=-1;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).getToDo().equalsIgnoreCase(td))
				pos=i;
		}
		return pos;
	}
	
	public void addToDo(ToDo td) {
		if(!checkToDo(td))
			lista.add(td);
	}
	
	public void remove(String td) {
		int pos=checkPosToDo(td);
		
		if(lista.size()>0 && pos!=-1) {
			lista.remove(pos);
			System.out.println("Voce rimossa");
		}
		else
			System.out.println("Lista vuota o indice non valido");
	}
	
	public void remove(int i) {
		if(lista.size()>0 && i<lista.size()) {
			lista.remove(i);
			System.out.println("Voce rimossa");
		}
		else
			System.out.println("Lista vuota o indice non valido");
	}
}
