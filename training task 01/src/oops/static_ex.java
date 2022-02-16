package oops;
import functions_and_methods.arith;
//import java.util.Scanner;

class leap_year{
	static int year = 2000;
	//static Scanner s = new Scanner(System.in);
	
	static void year() {
		System.out.println("Enter year: " + year);
		//year = s.nextInt();
		
		if(year%4==0) {
			System.out.println("This is leap year.");
		}
		else {
			System.out.println("This not leap year.");
		}
	}
}



public class static_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leap_year.year();
		//leap_year.year=2022;
		//leap_year.year();
		arith demo = new arith();
		demo.armstrong();
		
		/*
		int input, checkNum1, checkNum2, checkNum3 = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Input number to check: ");
		input = s.nextInt();
		checkNum1 = input;
		while(checkNum1>0) {
			checkNum2 = checkNum1%10;
			//System.out.println("testing checkNum2: "+checkNum2);
			checkNum3 += checkNum2*checkNum2*checkNum2;
			//System.out.println("testing checkNum3: "+checkNum3);
			checkNum1 = (checkNum1 - checkNum2)/10;
			//System.out.print();
		}
		if(checkNum3 == input) {
			System.out.println(input+" is an armstrong number");
		}
		else
		{
			System.out.println(input+" is not an armstrong number");
		}
		*/
		
	}

}
