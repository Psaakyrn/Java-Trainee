package Collection_Demo;
import java.util.*;

class Student{
	int rollno;
	String name;
	int age;
	
	Student(int i_rollno, String i_name, int i_age){
		rollno = i_rollno;
		name = i_name;
		age = i_age;
	}
}
class Employee{
	int emp_no;
	String name, dept;
	int age;
	
	Employee(int i_emp_no, String i_name, int i_age, String i_dept){
		emp_no = i_emp_no;
		name = i_name;
		age = i_age;
		dept = i_dept;
	}
}

public class arr_list_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101,"Abba",22);
		Student s2 = new Student(102,"Clara",21);
		Student s3 = new Student(103,"Dara",23);
		Student s4 = new Student(104,"Babara",20);
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		
		Iterator<Student> i = a1.iterator();
		
		while(i.hasNext()) {
			Student s0 = (Student)i.next();
			System.out.println("Student "+s0.rollno+" -- Name: "+s0.name+" -- Age: "+s0.age);
		}
	}

}
