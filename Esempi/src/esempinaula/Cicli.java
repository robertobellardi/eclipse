package esempinaula;

public class Cicli {

	public static void main(String[] args) {
		//ciclo(0,0,100,100);
		printTriangoloRettangoloBaseGiu();
		printTriangoloRettangoloBaseSu();
		printTriangoloIsosceleBaseGiu();
		printTriangoloIsosceleBaseSu();
		rombo();
	}
	
	public static void ciclo(int i, int j, int maxI, int maxJ) {
		int minj=j;
		for(;i<maxI;i++) {
			for(;j<maxJ;j++)
				System.out.print("*");
			j=minj;
			System.out.print("\n");
		}
	}
	
	public static void printTriangoloRettangoloBaseGiu() {
		for(int i=1;i<10;i++) {
			for(int j=0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printTriangoloRettangoloBaseSu() {
		for(int i=1;i<10;i++) {
			for(int j=0;j<10-i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printTriangoloIsosceleBaseGiu() {
		for(int i=0;i<10/2;i++) {
			for(int j=0;j<10;j++) {
				if(j>=10/2-i && j<=10/2+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}				
			System.out.println();
		}
		System.out.println();
	}
	
	public static void printTriangoloIsosceleBaseSu() {
		for(int i=0;i<10/2;i++) {
			for(int j=0;j<10;j++) {
				if(j>i && j<10-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}				
			System.out.println();
		}
		System.out.println();
	}
	
	public static void rombo() {
		
		for(int i=0;i<10/2;i++) {
			for(int j=0;j<10;j++) {
				if(j>=10/2-i && j<=10/2+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}				
			System.out.println();
		}		
		for(int i=1;i<10/2;i++) {
			for(int j=0;j<10;j++) {
				if(j>i && j<10-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}				
			System.out.println();
		}
		System.out.println();
	}
}
