package esempinaula;

public class LanciaDadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++)
				System.out.println((i+1)+" "+(j+1));
			System.out.println();
		}
		
		int rand=(int)(Math.random()*6+1);
		System.out.println(rand);
	}

}
