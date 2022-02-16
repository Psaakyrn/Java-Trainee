package oops;
//import java.util.Scanner;

/* === declared in a different file ===
class Student{
	int regNo;
	String name;
	int mark1;
	int mark2;
	int mark3;
	int tot;
	float avg;
	
	Student(){
		System.out.println("*** Default constructor, blank init ***");
		this.regNo = 0;
		this.name = "";
	}
	
	Student(int input_regNo, String input_name){
		this.regNo = input_regNo;
		this.name = input_name;
	}
	Student(int input_regNo, String input_name,int m1, int m2, int m3){
		this.regNo = input_regNo;
		this.name = input_name;
		this.mark1 = m1;
		this.mark2 = m2;
		this.mark3 = m3;
	}
	void getData() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Mark 1: ");
		mark1 = s.nextInt();
		System.out.println("Enter Mark 2: ");
		mark2 = s.nextInt();
		System.out.println("Enter Mark 3: ");
		mark3 = s.nextInt();
		calculate();
	}
	void calculate() {
		tot = mark1+mark2+mark3;
		avg = ((float)tot)/3;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Registered code: "+regNo);
		System.out.println("Mark 1: "+mark1);
		System.out.println("Mark 2: "+mark2);
		System.out.println("Mark 3: "+mark3);
		System.out.println("Total: "+tot);
		System.out.println("Average: "+avg);
		
	}
}
 */

class res_cls extends Student{
	String result;
	void calculate() {
		super.calculate();
		if(mark1>=50&mark2>50&mark3>50)
		{
			result = "pass";
		}
		else
		{
			result = "fail";
		}
	}
	void getData() {
		super.getData();
		calculate();
	}
	void report() {
		display();
		System.out.println("Result: "+result);				
	}
	res_cls(int input_regNo, String input_name,int m1, int m2, int m3){
		super(input_regNo, input_name,m1, m2, m3);
		calculate();
	}
	res_cls(int input_regNo, String input_name){
		super(input_regNo, input_name);
		calculate();
	}
}

class grade_cls extends res_cls{
	String grade;
	
	void calculate() {
		super.calculate();
		if(avg >= 75) {
			grade = "A";
		}else if (avg >= 65) {
			grade = "B";
		}else if (avg >= 55) {
			grade = "C";
		}else if (avg >= 45) {
			grade = "D";
		}else {
			grade = "F";
		} 
	}
	void report() {
		super.report();		
		System.out.println("Grade: "+grade);		
	}
	grade_cls(int input_regNo, String input_name,int m1, int m2, int m3){
		super(input_regNo, input_name,m1, m2, m3);
		calculate();
	}
	grade_cls(int input_regNo, String input_name){
		super(input_regNo, input_name);
		calculate();
	}
}

public class hierarchical_ex {
	public static void main(String args[]) {
		System.out.println("== Student 1: student class ==");		
		Student stud1 = new res_cls(12512,"Pat");
		stud1.getData();
		stud1.display();
		//stud1.report();
		System.out.println("== Student 2: result class ==");		
		res_cls stud2 = new res_cls(12412,"Jim");
		stud2.getData();
		stud2.report();
		System.out.println("== Student 3: grade class ==");		
		grade_cls stud3 = new grade_cls(12312,"Tom");
		stud3.getData();
		stud3.report();
	}
}
