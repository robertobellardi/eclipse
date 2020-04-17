package eccezioni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaFile {

	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\sviluppo\\Desktop\\albapemba.jpg");
			FileOutputStream fout=new FileOutputStream("CopiaImg.jpg");
			
			int car;
			while((car=fin.read()) != -1) {
				fout.write(car);
			}
			fin.close();
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
