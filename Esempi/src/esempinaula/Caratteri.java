package esempinaula;

public class Caratteri {
	public static void main(String[] args) {
		
		char c;
		for(int i=0;i<255;i++) {
			c=(char)i;
			System.out.print(c);
			if(i%10==0)
				System.out.println();
		}
		System.out.println();
		String s="Buongiorno a tutti";
		
		for(int j=0;j<s.length();j++)
			System.out.println(s.charAt(j));
			
	}

}
