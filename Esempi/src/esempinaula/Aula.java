package esempinaula;

import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		
		Studente[] studenti = {
				new Studente("EUGENIO","ALOI"),
				new Studente("PIERO","BAGLIVO"),
				new Studente("ALESSIA","BALCONETTI"),
				new Studente("ROBERTO","BELLARDI GIOLI"),
				new Studente("CHIARA","BUSINARO"),
				new Studente("MATTEO","CALFA"),
				new Studente("OANA VIORICA","CERBU"),
				new Studente("LAURA","CONTI"),
				new Studente("JAVIER","DE LA FUENTE"),
				new Studente("MIHAI","FEDOT"),
				new Studente("AHMED","HABOULA"),
				new Studente("BIAGIO","INGUSCI"),
				new Studente("MATTIA","ISOLDI"),
				new Studente("ANDREA EDSON","LORENZONI"),
				new Studente("FEDERICA","LUISE"),
				new Studente("VALENTINA","MANGIONE"),
				new Studente("MARIARITA","MASIA"),
				new Studente("MATTIA","MONTENEGRO")				
		};

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int presenti=0;
		int assenti=0;
		for (int i = 0; i < studenti.length; i++) {
			System.out.println((i+1)+": "+studenti[i].sign()+ " è presente?" );
			String risposta = in.next();
			if(risposta.contentEquals("s")) {
				presenti++;
			} else {
				assenti++;
			}
		}		
		System.out.println("Sono presenti "+presenti+" studenti");
		System.out.println("Sono assenti "+assenti+" studenti");	
	}
}