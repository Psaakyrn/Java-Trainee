package functions_and_methods;

import java.util.Scanner;


class demo_math{
	int add(int num1, int num2) {
		return (num1+num2);
	}
	int sub(int num1, int num2) {
		return (num1-num2);
		
	}
	int mul(int num1, int num2) {
		return (num1*num2);		
	}
	float div(int num1, int num2) {
		return ((float)num1/num2);
		
	}
	int mod(int num1, int num2) {
		return (num1%num2);		
	}
	
}
public class method1 {
	
	public static void main(String args[]) {
		demo_math obj1 = new demo_math();
		demo_math obj2 = new demo_math();
		demo_math obj3 = new demo_math();
		Scanner s = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int option = 0;
		boolean continueLoop = true;
		do {
			System.out.println("=== Options ===");
			System.out.println("1: Add");
			System.out.println("2: Subtract");
			System.out.println("3: Multiply");
			System.out.println("4: Divide");
			System.out.println("5: Modulus");
			System.out.print("Select option: ");
			option = s.nextInt();
			System.out.print("Enter first number: ");
			num1 = s.nextInt();
			System.out.print("Enter second number: ");
			num2 = s.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Addition Result is: "+obj1.add(num1, num2));
				break;
			case 2:
				System.out.println("Subtraction Result is: "+obj1.sub(num1, num2));
				break;
			case 3:
				System.out.println("Multiplication Result is: "+obj2.mul(num1, num2));
				break;
			case 4:
				System.out.println("Division Result is: "+obj2.div(num1, num2));
				break;
			case 5:
				System.out.println("Modulus Result is: "+obj3.mod(num1, num2));
				break;
			default:
				System.out.println("Invalid input");
			
			}
			System.out.print("\nDo you wish to continue: ");
			String isContinue = s.next();
			if(isContinue.equals("y") || isContinue.equals("Y") || isContinue.equals("yes") || isContinue.equals("Yes"))
			{
				continueLoop = true;
				System.out.println();
			}
			else {
				continueLoop = false;
			}
		} while(continueLoop);
		s.close();
	}
}
