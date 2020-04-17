package esempinaula;

public class ArrayMultidimensionale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2 , b=3;
		
		int [][]mat=new int[a][b];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				mat[i][j]=j+1+i*2;
		}
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				System.out.print(mat[i][j]+ " ");
			System.out.println();
		}

	}

}
