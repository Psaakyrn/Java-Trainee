package oops;

class StudTest{
	private int stud_id;
	private String name,dept,uni;
	
	public void setStudent_id(int input) {
		stud_id = input;
	}
	public void setName(String input) {
		name = input;
	}
	public void setDept(String input) {
		dept = input;
	}
	public void setUniversity(String input) {
		uni = input;
	}
	public int getStudent_id() {
		return stud_id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getUniversity() {
		return uni;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Student ID: "+stud_id);
		System.out.println("Dept: "+dept);
		System.out.println("University: "+uni);
	}
}

public class stud_bean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudTest s1 = new StudTest();
		s1.setName("Jon");
		s1.setStudent_id(212);
		s1.setDept("IT");
		s1.setUniversity("Mon");
		
		s1.display();
	}

}
