package Collection_Demo;

import java.util.*;

class Employee_Data{
	int emp_id;
	String name,role,company;
	//int nos;
	public Employee_Data(int emp_id_, String name_, String role_, String company_) {
		emp_id = emp_id_;
		name = name_;
		role = role_;
		company = company_;
		
	}
}	

public class linked_list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Tim");
		l1.add("tam");
		l1.add("tom");
		l1.add("tam");
		l1.add("Tim");
		System.out.println("Init: "+l1);
		
		l1.set(2, "Bob");
		System.out.println("After set(2,\"Bob\": "+l1);
		Collections.sort(l1);
		System.out.println("After Collections.sort: "+l1);
		System.out.println();
		
		LinkedList<Employee_Data> edata = new LinkedList<Employee_Data>();
		edata.add(new Employee_Data(1001,"Tim","CEO","DSB"));
		edata.add(new Employee_Data(1002,"Tam","CFO","DSB"));
		edata.add(new Employee_Data(1003,"Tom","CBO","DSB"));
		
		for(Employee_Data ed:edata) {
			//list.removeLast();
			System.out.println("Employee "+ed.emp_id+":\t"+ed.name+"\t"+ed.role+"\t"+ed.company);
		}

	}
	

}
