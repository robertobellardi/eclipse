package controller;

import java.util.ArrayList;
import model.Studente;

public class Registro {
	
	ArrayList<Studente> registro;
	ArrayList<Studente> presenti;
	ArrayList<Studente> assenti;
	
	public Registro() {
		this.registro = new ArrayList<>();
		this.presenti = new ArrayList<>();
		this.assenti = new ArrayList<>();
		init();
	}
	
	public void init() {
		this.registro.add(new Studente("EUGENIO","ALOI"));
		this.registro.add(new Studente("PIERO","BAGLIVO"));
		this.registro.add(new Studente("ALESSIA","BALCONETTI"));
		this.registro.add(new Studente("ROBERTO","BELLARDI GIOLI"));
		this.registro.add(new Studente("CHIARA","BUSINARO"));
		this.registro.add(new Studente("MATTEO","CALFA"));
		this.registro.add(new Studente("OANA VIORICA","CERBU"));
		this.registro.add(new Studente("LAURA","CONTI"));
		this.registro.add(new Studente("JAVIER","DE LA FUENTE"));
		this.registro.add(new Studente("MIHAI","FEDOT"));
		this.registro.add(new Studente("AHMED","HABOULA"));
		this.registro.add(new Studente("BIAGIO","INGUSCI"));
		this.registro.add(new Studente("MATTIA","ISOLDI"));
		this.registro.add(new Studente("ANDREA EDSON","LORENZONI"));
		this.registro.add(new Studente("FEDERICA","LUISE"));
		this.registro.add(new Studente("MARIARITA","MASIA"));
		this.registro.add(new Studente("MATTIA","MONTENEGRO"));
	}
		
	public ArrayList<Studente> getRegistro() {
		return registro;
	}

	public void setRegistro(ArrayList<Studente> registro) {
		this.registro = registro;
	}

	public ArrayList<Studente> getPresenti() {
		return presenti;
	}

	public void setPresenti(ArrayList<Studente> presenti) {
		this.presenti = presenti;
	}

	public ArrayList<Studente> getAssenti() {
		return assenti;
	}

	public void setAssenti(ArrayList<Studente> assenti) {
		this.assenti = assenti;
	}
}
