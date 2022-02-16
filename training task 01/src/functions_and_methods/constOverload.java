package functions_and_methods;

class student{
	int regNo;
	String university,address,dept;
	
	student(){
		System.out.println("*** Default constructor, blank init ***");
		this.regNo = 0;
		this.university = "";
		this.address = "";
		this.dept = "";
	}
	
	student(int input_regNo, String input_university){
		this.regNo = input_regNo;
		this.university = input_university;
		this.address = "";
		this.dept = "";
	}
	student(int input_regNo, String input_university, String input_address, String input_dept){
		this.regNo = input_regNo;
		this.university = input_university;
		this.address = input_address;
		this.dept = input_dept;
	}
	void display() {
		System.out.println("University: "+university);
		System.out.println("Registered code: "+regNo);
		System.out.println("Address: "+address);
		System.out.println("Department: "+dept);
	}
}

public class constOverload {
	public static void main(String args[]) {
		student s1 = new student();
		student s2 = new student(1234, "MMB");
		student s3 = new student(3455,"BBM","SG","Comp");
		System.out.println("== Student 1 ==");
		s1.display();
		System.out.println("== Student 2 ==");
		s2.display();
		System.out.println("== Student 3 ==");
		s3.display();
	}
}
