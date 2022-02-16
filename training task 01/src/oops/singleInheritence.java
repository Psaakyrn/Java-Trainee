package oops;
import java.util.*;

class Student{
	int regNo;
	String name;
	int mark1;
	int mark2;
	int mark3;
	int tot;
	float avg;
	Scanner s;
	
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
		calculate();
	}
	void getData() {
		
		System.out.println("Enter Mark 1: ");
		mark1 = s.nextInt();
		System.out.println("Enter Mark 2: ");
		mark2 = s.nextInt();
		System.out.println("Enter Mark 3: ");
		mark3 = s.nextInt();
		calculate();
		//s.close();
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
class MarkList extends Student
{
	int tot;
	float avg;
	String grade,result;

	void calculate() {
		tot = mark1+mark2+mark3;
		avg = ((float)tot)/3;
		result = "pass";
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
			result = "fail";
		} 
	}
	
	MarkList(int input_regNo, String input_name,int m1, int m2, int m3){
		super(input_regNo, input_name,m1, m2, m3);
		calculate();
	}
	
	int getTotal() {
		return tot;
	}
	float getAverage() {
		return avg;
	}
	String getGrade() {
		return grade;
	}
	String getResult() {
		return result;
	}
	void report() {
		display();
		System.out.println("Total: "+tot);		
		System.out.println("Average: "+avg);		
		System.out.println("Grade: "+grade);		
		System.out.println("Result: "+result);		
	}
}

public class singleInheritence {

}
