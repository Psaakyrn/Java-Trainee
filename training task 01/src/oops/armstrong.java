package oops;
import java.util.*;

public class armstrong {
	
	static void countSeries(int input) {
		//int total = 0;
		int numA, numB, numC;
		numA = 0;
		numB = 1;
		if(input > 0 ) {
			System.out.print(numA);
		}
		if(input > 1 ) {
			System.out.print(" "+numB);
		}
		for (int i = 2;i<input;i++)
		{
			numC = numA+numB;
			numA = numB;
			numB = numC;
			System.out.print(" "+numB);
		}
		System.out.println("");
		//return total;
	}
	
	static void countSeries(int num1,int num2, int input) {
		//int total = 0;
		int numA, numB, numC;
		numA = num1;
		numB = num2;
		if(input > 0 ) {
			System.out.print(numA);
		}
		if(input > 1 ) {
			System.out.print(" "+numB);
		}
		for (int i = 2;i<input;i++)
		{
			numC = numA+numB;
			numA = numB;
			numB = numC;
			System.out.print(" "+numB);
		}
		System.out.println("");
		//return total;
	}
	

	static boolean isArmstrong(int input) {
		//int input, checkNum, digitCount, digitPowered;
		int checkNum, digitCount, digitPowered;
		int numberDigits[];
		System.out.println("Armstrong!");
		//System.out.println("Input number to check: ");
		//input = s.nextInt();
		checkNum = input;
		digitCount = 0;
		while(checkNum>0) {
			//checkNum = (checkNum - checkNum%10)/10;
			checkNum = checkNum/10;
			digitCount++;
			//System.out.print();
		}
		if(digitCount>0) {
			checkNum = input;
			numberDigits = new int[digitCount];
			digitCount = 0;
			while(checkNum>0) {
				numberDigits[digitCount] = checkNum%10;
				checkNum = checkNum/10;
				digitCount++;
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
				//System.out.println("digit total check: "+checkNum);
				
			}
		}
		if(checkNum == input) {
			System.out.println(input+" is an armstrong number");
			return true;
		}
		else
		{
			System.out.println(input+" is not an armstrong number, total is: "+checkNum);
			return false;
		}
		//return false;
		//return checkNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Input number: ");
		armstrong.isArmstrong(s.nextInt());
		System.out.print("Input number: ");
		armstrong.countSeries(s.nextInt());
		System.out.print("Input number 1: ");
		int num1 = s.nextInt();
		System.out.print("Input number 2: ");
		int num2 = s.nextInt();
		System.out.print("Input number count: ");
		armstrong.countSeries(num1, num2, s.nextInt());
		s.close();

	}

}
