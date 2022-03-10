import java.time.*;

public class Emp {
	private int id, salary;
	private String name, dept;
	private LocalDate dob;
	
	public int getID(){return id;}
	public String getName(){return name;}
	public LocalDate getDoB(){return dob;}
	public String getDept(){return dept;}
	public int getSalary(){return salary;}
	
	public void setID(int _id){id = _id;}
	public void setName(String _name){name = _name;}
	public void setDoB(LocalDate _dob){dob = _dob;}
	public void setDept(String _dept){dept = _dept;}
	public void setSalary(int _salary){salary = _salary;}
	
	Emp(int _id, String _name, LocalDate _dob, String _dept, int _salary) {
		id = _id;
		name = _name;
		dob = _dob;
		dept = _dept;
		salary = _salary;
	}
	Emp() {
		id=0;
	}
}
