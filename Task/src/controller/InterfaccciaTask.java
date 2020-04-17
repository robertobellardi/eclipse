package controller;

import java.util.ArrayList;

public interface InterfaccciaTask {
	boolean addTask(String categoria,String task);
	ArrayList<String[]> getAllTask();
	ArrayList<String> getAllCategorie();
	String getTaskById(int i);
	String getCatById(int i);
}