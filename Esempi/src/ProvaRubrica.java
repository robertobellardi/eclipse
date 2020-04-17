
public class ProvaRubrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rubrica r=new Rubrica(5);
		
		long inizio=System.currentTimeMillis();
		
		r.aggiungiVoci("Roberto", "3482352963");
		r.aggiungiVoci("Andrea", "3492352963");
		r.aggiungiVoci("Ciccio", "3493352963");
		r.aggiungiVoci("Marco", "3492352923");
		r.aggiungiVoci("Simone", "3422352963");
		r.aggiungiVoci("Piero", "3492782963");
		r.aggiungiVoci("Biagio", "3492378963");
		r.aggiungiVoci("biagio", "3492752963");
		r.aggiungiVoci("123", "3492312963");
		r.aggiungiVoci("321", "3492212963");
		System.out.println(r);
		
		System.out.println("Tempo : "+(System.currentTimeMillis()-inizio));
	}

}
