package File_handling;
import java.io.*;

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int emp_id,salary;
	String name;
	
	public Employee(int emp_id_,String name_,int salary_){
		this.emp_id = emp_id_;
		this.name = name_;
		this.salary = salary_;
	}	
}
class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int stud_id, mark;
	char gender;
	String name;
	
	public Student(int stud_id_,String name_,char gender_, int mark_){
		this.stud_id = stud_id_;
		this.name = name_;
		this.gender = gender_;
		this.mark = mark_;
	}	
}

public class serialization_ex {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		String file_loc = "C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\";

		Employee e1 = new Employee(10001,"Tom",24999);
		Employee e2 = new Employee(10002,"Sam",28999);
		
		FileOutputStream fos = new FileOutputStream(file_loc+"emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
		
		oos.flush();
		oos.close();
		fos.close();		
		oos=null;
		fos=null;
		
		System.out.println("Done.");
		
		FileInputStream fis = new FileInputStream(file_loc+"emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e_01 = (Employee) ois.readObject();
		Employee e_02 = (Employee) ois.readObject();
		
		ois.close();
		fis.close();
		ois=null;
		fis=null;
		
		System.out.println("Employee "+e_01.emp_id+" Name:\t"+e_01.name+"\tSalary:\t$"+e_01.salary);
		System.out.println("Employee "+e_02.emp_id+" Name:\t"+e_02.name+"\tSalary:\t$"+e_02.salary);

		/// Student Demo ///
		
		Student s1 = new Student(3002,"Jim",'M',78);
		Student s2 = new Student(3003,"Yam",'F',87);
		
		fos = new FileOutputStream(file_loc+"stud_list.txt");
		oos = new ObjectOutputStream(fos);
	
		oos.writeObject(s1);
		oos.writeObject(s2);
	
		oos.flush();
		oos.close();
		fos.close();		
		oos=null;
		fos=null;
		
		System.out.println("Done. Again.");
		
		fis = new FileInputStream(file_loc+"stud_list.txt");
		ois = new ObjectInputStream(fis);
		Student s_01 = (Student) ois.readObject();
		Student s_02 = (Student) ois.readObject();
		
		ois.close();
		fis.close();
		ois=null;
		fis=null;
		
		System.out.println("Student "+s_01.stud_id+" Name:\t"+s_01.name+" ("+s_01.gender+")\tMark: "+s_01.mark);
		System.out.println("Student "+s_02.stud_id+" Name:\t"+s_02.name+" ("+s_02.gender+")\tMark: "+s_02.mark);
	}

}
