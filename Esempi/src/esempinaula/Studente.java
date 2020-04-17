package esempinaula;

import java.time.*;

public class Studente {
	
	private String firstName;
	private String secondName;
	private int yearsOld;
	private int day;
	private int month;
	private int year;
	private int riga;
	private int colonna;

	public Studente(String firstName,String secondName,int yearOld,int day,int month,int year,int riga,int colonna) {
		// TODO Auto-generated constructor stub
		this.setFirstName(firstName);
		this.setSecondName(secondName);
		this.setYearsOld(yearOld);
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
		this.setRiga(riga);
		this.setColonna(colonna);
	}
	
	public Studente(String firstName,String secondName) {
		// TODO Auto-generated constructor stub
		this.setFirstName(firstName);
		this.setSecondName(secondName);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getRiga() {
		return riga;
	}

	public void setRiga(int riga) {
		this.riga = riga;
	}

	public int getColonna() {
		return colonna;
	}

	public void setColonna(int colonna) {
		this.colonna = colonna;
	}
	
	public int calcolataEta() {
		LocalDateTime ld=LocalDateTime.now();
		return ld.getYear()-this.getYear();
	}
	
	public String toString() {
		return "Nome :\t\t\t"+ this.firstName+
				"\nCognome :\t\t"+this.secondName+
				"\nEtà :\t\t\t"+this.yearsOld+" anni"+
				"\nData di nascita :\t"+this.day+"/"+this.month+"/"+this.year+
				"\nRiga : \t\t\t"+this.riga+
				"\nColonna : \t\t"+this.colonna;
	}
	
	public String sign() {
		return (this.firstName.substring(0, 1)+". "+this.secondName).toLowerCase();
	}
}
