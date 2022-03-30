package com.spring.demo;

import java.time.LocalDate;

public class Emp {
	private int id, salary;
	private String name, dept;
	private LocalDate dob;
	
	public int getId(){return id;}
	public String getName(){return name;}
	public LocalDate getDob(){return dob;}
	public String getDept(){return dept;}
	public int getSalary(){return salary;}
	
	public void setId(int _id){id = _id;}
	public void setName(String _name){name = _name;}
	public void setDobLocal(LocalDate _dob){dob = _dob;}
	public void setDob(String _dob){dob = LocalDate.parse(_dob);}
	public void setDept(String _dept){dept = _dept;}
	public void setSalary(int _salary){salary = _salary;}
	
	public Emp(int _id, String _name, LocalDate _dob, String _dept, int _salary) {
		id = _id;
		name = _name;
		dob = _dob;
		dept = _dept;
		salary = _salary;
	}
	public void setAll(int _id, String _name, LocalDate _dob, String _dept, int _salary) {
		id = _id;
		name = _name;
		dob = _dob;
		dept = _dept;
		salary = _salary;
	}
	public Emp() {
		id=0;
	}
	public String toString()
	{
		return "Emp: "+id+" "+name+" "+dob.toString()+" "+dept+" "+salary;
	}
}
