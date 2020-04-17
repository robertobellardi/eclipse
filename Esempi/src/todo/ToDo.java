package todo;

public class ToDo {
	
	private String todo;
	private int quantita;
	
	public ToDo(String todo,int quantita) {
		// TODO Auto-generated constructor stub
		this.todo=todo;
		this.quantita=quantita;
	}
	
	public String getToDo() {
		return this.todo;
	}
	
	public int getQuantity() {
		return this.quantita;
	}
		
	public String toString() {
		return this.todo+" "+this.quantita+"\n";
	}

}

