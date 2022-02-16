package functions_and_methods;
import java.util.Scanner;

public class arith {
	int num1, num2 = 0;
	
	Scanner s = new Scanner(System.in);
	
	int add() {
		System.out.println("Addition!");
		System.out.println("Enter num 1:");
		num1 = s.nextInt();
		System.out.println("Enter num 2:");
		num2 = s.nextInt();
		return (num1+num2);
	}
	int sub() {
		System.out.println("Subtraction!");
		System.out.println("Enter num 1:");
		num1 = s.nextInt();
		System.out.println("Enter num 2:");
		num2 = s.nextInt();
		return (num1-num2);
		
	}
	public float mul() {
		System.out.println("Multiplication!");
		System.out.println("Enter num 1:");
		num1 = s.nextInt();
		System.out.println("Enter num 2:");
		num2 = s.nextInt();
		return (num1*num2);		
	}
	float div() {
		System.out.println("Division!");
		System.out.println("Enter num 1:");
		num1 = s.nextInt();
		System.out.println("Enter num 2:");
		num2 = s.nextInt();
		return ((float)num1/num2);
		
	}
	int mod() {
		System.out.println("Modulus!");
		System.out.println("Enter num 1:");
		num1 = s.nextInt();
		System.out.println("Enter num 2:");
		num2 = s.nextInt();
		return (num1%num2);		
	}
	public int armstrong() {
/*
		int input, checkNum1, checkNum2, checkNum4 = 0;
		int checkNum3[];
		System.out.println("Armstrong!");
		System.out.println("Input number to check: ");
		input = s.nextInt();
		checkNum1 = input;
		checkNum2 = 0;
		while(checkNum1>0) {
			checkNum1 = (checkNum1 - checkNum1%10)/10;
			checkNum2++;
			//System.out.print();
		}
		if(checkNum2>0) {
			checkNum1 = input;
			checkNum3 = new int[checkNum2];
			checkNum2 = 0;
			while(checkNum1>0) {
				checkNum3[checkNum2] = checkNum1%10;
				checkNum1 = (checkNum1 - checkNum3[checkNum2])/10;
				checkNum2++;
				//System.out.print();
			}
			System.out.println("Total number of digits: "+checkNum2);
			checkNum1 = 0;
			checkNum4 = 0;
			for (int digit : checkNum3) {
				//System.out.println("digit check: "+digit);
				checkNum4 = 1;
				for(int i=0;i<checkNum2;i++) {
					checkNum4*=digit;
				}
				//System.out.println("digit power check: "+checkNum4);
				checkNum1 += checkNum4;
				
			}
		}
		if(checkNum1 == input) {
			System.out.println(input+" is an armstrong number");
		}
		else
		{
			System.out.println(input+" is not an armstrong number");
		}
		return checkNum1;
*/
		int input, checkNum, digitCount, digitPowered;
		int numberDigits[];
		System.out.println("Armstrong!");
		System.out.println("Input number to check: ");
		input = s.nextInt();
		checkNum = input;
		digitCount = 0;
		while(checkNum>0) {
			checkNum = (checkNum - checkNum%10)/10;
			digitCount++;
			//System.out.print();
		}
		if(digitCount>0) {
			checkNum = input;
			numberDigits = new int[digitCount];
			digitCount = 0;
			while(checkNum>0) {
				numberDigits[digitCount] = checkNum%10;
				checkNum = (checkNum - numberDigits[digitCount])/10;
				digitCount++;
				//System.out.print();
			}
			System.out.println("Total number of digits: "+digitCount);
			checkNum = 0;
			digitPowered = 0;
			for (int digit : numberDigits) {
				//System.out.println("digit check: "+digit);
				digitPowered = 1;
				for(int i=0;i<digitCount;i++) {
					digitPowered*=digit;
				}
				//System.out.println("digit power check: "+digitPowered);
				checkNum += digitPowered;
				
			}
		}
		if(checkNum == input) {
			System.out.println(input+" is an armstrong number");
		}
		else
		{
			System.out.println(input+" is not an armstrong number");
		}
		return checkNum;

	}
	
	public static void main(String args[]) {
		arith obj = new arith();
		Scanner s = new Scanner(System.in);
		//int resultI = 0;
		//int resultF = 0;
		int option = 0;
		System.out.println("=== Options ===");
		System.out.println("1: Add");
		System.out.println("2: Subtract");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");
		System.out.println("5: Modulus");
		System.out.println("6: Armstrong");
		System.out.print("Select option: ");
		option = s.nextInt();
		switch(option) {
		case 1:
			System.out.println("Result is: "+obj.add());
			break;
		case 2:
			System.out.println("Result is: "+obj.sub());
			break;
		case 3:
			System.out.println("Result is: "+obj.mul());
			break;
		case 4:
			System.out.println("Result is: "+obj.div());
			break;
		case 5:
			System.out.println("Result is: "+obj.mod());
			break;
		case 6:
			System.out.println("Checked number is: "+obj.armstrong());
			break;
		default:
			System.out.println("Invalid input");
		
		}
		s.close();
	}

	
}
