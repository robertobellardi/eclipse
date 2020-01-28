package view;

import java.sql.SQLException;
import java.util.ArrayList;

import controller.StudentiController;
import model.Studente;

public class Registro {

	public static void main(String[] args) {

		StudentiController sc=new StudentiController();
		try {
			ArrayList<Studente> st=sc.getAll();
			
			for(int i=0;i<st.size();i++)
				System.out.println(st.get(i).getId()+"-"+
						st.get(i).getNome()+"-"+
						st.get(i).getCognome()+"\n");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
