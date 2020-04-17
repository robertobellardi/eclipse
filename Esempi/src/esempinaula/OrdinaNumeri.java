package esempinaula;

import java.util.Scanner;

public class OrdinaNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("iserisci la dimensione dell' array : ");
		int dim=sc.nextInt();
		int i=0 , j=0 , tmp=0;
		if(dim>=0) {
			int[] vet=new int[dim];
			for(i=0;i<dim;i++) {
				System.out.print("Iserisci il "+(i+1)+"° numero :");
				if(sc.hasNextInt())
					vet[i]=sc.nextInt();
				else {
					System.out.println("Numero non valido : "+sc.next());
					i--;
				}
			}
			System.out.println("\nStampo array");
			for(i=0;i<vet.length;i++) {
				System.out.print(vet[i]+" ");
			}
			System.out.println();
			sc.close();
			
			for(i=0;i<vet.length-1;i++) {
				for(j=i+1;j<vet.length;j++) {
					if(vet[i]>vet[j]) {
						tmp=vet[i];
						vet[i]=vet[j];
						vet[j]=tmp;
					}						
				}
			}
			System.out.println("\nStampo l'array ordinato");
			for(i=0;i<vet.length;i++)
				System.out.print(vet[i]+" ");			
		}
		else {
			System.out.println("Dimensione array non valida");
		}
		
	}

}

