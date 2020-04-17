package eccezioni;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Eccezioni{

	public static void main(String[] args) throws IOException {
	
		String path = "C:/Users/sviluppo/Desktop/Roberto/Esempi/src/Input";
		int size = 0;
		FileReader fr = new FileReader(path);
		FileWriter fw=new FileWriter("FileScrittura.txt");
		PrintWriter pw=new PrintWriter(fw);
		Scanner sc=new Scanner(fr);
		try {		
			while(sc.hasNext()) {
				pw.println(Integer.parseInt(sc.nextLine()));
				System.out.println("Stampo");
				size++;
			}			
		}
		finally {
			System.out.println("Le righe sono ---> "+size);
			sc.close();
			pw.close();
		}
	}
}
