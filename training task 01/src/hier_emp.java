import java.util.Scanner;

class emp_data {
	int emp_id = 0;
	String emp_name;
	
	Scanner sc = new Scanner(System.in);
	
	void getData() {
		System.out.println("Enter employee name:");
		emp_name = sc.next();
		System.out.println("Enter employee ID:");
		emp_id = sc.nextInt();
		//sc.nextLine();//clear input
		
	}
	void display() {
		System.out.println("=====");
		System.out.println("Pay Slip for (insert date here)");
		System.out.println("=====");
		System.out.println("Employee name: "+emp_name+	"\tEmployee ID: "+emp_id);
		System.out.println("=====");
/*
		System.out.println("\tPR Deduction: "+pr+	"\tHRA: "+hra+	);
		System.out.println("tax: "+tax+				"\tDA: "+da);
		System.out.println("=====");
		
		System.out.println("Total Earnings: "+emp_id);
		System.out.println("Deductions: "+emp_id);
		System.out.println("=====");
*/
	}
}
class emp_data_calc extends emp_data{
	float base_sal,hra,da,tax,pr = 0;
	void getData() {
		super.getData();
		System.out.println("Enter employee basic salary:");
		base_sal = sc.nextFloat();
		//sc.nextLine();//clear input
		calculate();
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
		super.display();
		System.out.println("Basic Salary: "+base_sal);
		System.out.println("PR Deduction: "+pr+	"\tHRA: "+hra);
		System.out.println("tax: "+tax+			"\tDA: "+da);
		System.out.println("=====");
		
	}
}
class emp_data_tot extends emp_data_calc{
	float tot_ded,tot_ear,gross = 0;
	void calculate() {
		super.calculate();
		tot_ear = base_sal + hra + da;
		tot_ded = pr+tax;
		gross = tot_ear - tot_ded;
	}
	void display() {
		super.display();
		System.out.println("total earnings: "+tot_ear);
		System.out.println("total deductions: "+tot_ded);
		System.out.println("gross earnings: "+gross);
		System.out.println("=====");
		
	}
}

public class hier_emp {
	public static void main(String args[]) {
		emp_data_tot emp1 = new emp_data_tot();
		emp1.getData();
		emp1.display();
	}
}
