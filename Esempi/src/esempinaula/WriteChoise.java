package esempinaula;

public class WriteChoise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		chooseForMe(100000);	
	}
	
	public static void chooseForMe(int max) {
		Contatore contOkay=new Contatore();
		Contatore contNotOkay=new Contatore();
		Double scelta=0.0;
		
		for(int i=0;i<max;i++){
			scelta=Math.random();
			
			if(scelta<=0.5)
				contOkay.incrementa();
			else
				contNotOkay.incrementa();
		}
		
		System.out.println("Okay =="+contOkay+"vs "+"non okay =="+contNotOkay);
	}

}
