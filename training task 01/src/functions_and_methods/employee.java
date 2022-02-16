package functions_and_methods;
import java.util.Scanner;

class employee_unit {
	String employeeID;
	String employeeName;
	String employeeAddress;
	String company;
	String city;
	String department;
	
	employee_unit(){
		employeeID = "";
		employeeName = "";
		employeeAddress = "";
		company = "";
		city = "";
		department = "";
	}
	employee_unit(String empID, String empName, String empAddr, String comName, String cityName, String depName){
		employeeID = empID;
		employeeName = empName;
		employeeAddress = empAddr;
		company = comName;
		city = cityName;
		department = depName;
	}
	employee_unit(String comName, String cityName, String depName){
		//employeeID = empID;
		//employeeName = empName;
		company = comName;
		city = cityName;
		department = depName;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Input Employee ID: ");
		employeeID = s.next();
		System.out.print("Input Employee Name: ");
		employeeName = s.next();
		System.out.print("Input Employee Address: ");
		employeeAddress = s.next();
		s.close();
	}
	void display() {
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Name: "+employeeName);
		System.out.println("Address: "+employeeAddress);
		System.out.println("Company: "+company);
		System.out.println("City: "+city);
		System.out.println("Department: "+department);
	}
}
public class employee {
	public static void main(String args[]) {
		System.out.println("=== Creating Employee ===");
		employee_unit e1 = new employee_unit();
		employee_unit e2 = new employee_unit("DSB","SG","bank");
		employee_unit e3 = new employee_unit("3232","Jon","Jem","DSC","MY","corp");
		System.out.println("=== Displaying Employee 1 ===");
		e1.display();
		System.out.println("=== Displaying Employee 2 ===");
		e2.display();
		System.out.println("=== Displaying Employee 3 ===");
		e3.display();
	}
}
