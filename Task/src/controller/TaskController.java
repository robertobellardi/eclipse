package controller;

import java.util.ArrayList;
import java.util.TreeSet;

import model.Task;

public class TaskController implements InterfaccciaTask{
	
	private ArrayList<Task> tuttiTask;
	private TreeSet<String> tutteCat;

	public TaskController() {
		this.tuttiTask = new ArrayList<>();
		this.tutteCat=new TreeSet<>();
	}

	@Override
	public boolean addTask(String categoria, String task) {
		Task t=new Task(task,categoria);
		boolean addT=false;
		addT=tuttiTask.add(t);
		boolean addC=false;
		addC=tutteCat.add(categoria);
		return (addT==addC && addT==true);
	}

	@Override
	public ArrayList<String[]> getAllTask() {
		ArrayList<String[]> al=new ArrayList<>();
		for(int i=0;i<tuttiTask.size();i++) {
			String[] array={tuttiTask.get(i).getCoseDaFare(),tuttiTask.get(i).getDataInizio().toString()};
			al.add(array);
		}
		return al;
	}

	@Override
	public ArrayList<String> getAllCategorie() {
		ArrayList<String> al=new ArrayList<>();
		for(String s: tutteCat)
			al.add(s);
		return al;
	}

	@Override
	public String getTaskById(int i) {
		return tuttiTask.get(i).getCoseDaFare();
	}

	@Override
	public String getCatById(int i) {
		return tuttiTask.get(i).getCategoria();
	}

	
	
}
