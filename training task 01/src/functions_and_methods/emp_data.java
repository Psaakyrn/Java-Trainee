package functions_and_methods;
import java.util.Scanner;

public class emp_data {
	int emp_id, age = 0;
	String emp_name,dept;
	float base_sal,hra,da,tax,pr,tot_ded,tot_ear,gross = 0;
	
	Scanner sc = new Scanner(System.in);
	
	void getDate() {
		System.out.println("Enter employee name:");
		emp_name = sc.next();
		System.out.println("Enter employee ID:");
		emp_id = sc.nextInt();
		//sc.nextLine();//clear input
		System.out.println("Enter employee basic salary:");
		//base_sal = sc.nextFloat();
		sc.nextLine();//clear input
		
	}
	
	void calculate() {
		//insert calculations here
		if(base_sal>1000 && base_sal<2000) {
			hra = 9*10/100;
			da=base_sal*9/100;
			tax=base_sal*9/100;
			pr=base_sal*9/100;
		}
		else { //default
			hra = 7*10/100;
			da=base_sal*7/100;
			tax=base_sal*7/100;
			pr=base_sal*7/100;
			
		}
	}
	void display() {
		System.out.println("=====");
		System.out.println("Pay Slip for (insert date here)");
		System.out.println("=====");
		System.out.println("Employee name: "+emp_name+	"\tEmployee ID: "+emp_id);
		System.out.println("Basic Salary: "+base_sal+	"\tPR Deduction: "+emp_id);
		System.out.println("HRA: "+hra+	"\tax: "+tax);
		System.out.println("DA: "+da);
		System.out.println("=====");
		System.out.println("Employee name: "+emp_name+	"\tEmployee ID: "+emp_id);
		System.out.println("Employee name: "+emp_name+	"\tEmployee ID: "+emp_id);
		System.out.println("=====");

	}
	
	public static void main(String args[]) {
	}
	
}
