import java.util.*;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		int rangeCondition2Lower = 0; // missing values in question, using arbitrary values
		int rangeCondition2Upper = 5; // missing values in question, using arbitrary values
		int rangeCondition3Lower = 6; // missing values in question, using arbitrary values
		int rangeCondition3Upper = 10;// missing values in question, using arbitrary values
		int rangeCondition4 = 10;     // missing values in question, using arbitrary values
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value:");
		i=s.nextInt();
		
		if(i%2 == 1)//odd
		{
			System.out.println("Weird");
		}
		else if(i>= rangeCondition2Lower && i <= rangeCondition2Upper) { //values missing in question, using arbitrary values
			System.out.println("Not Weird");
		}
		else if(i>= rangeCondition3Lower && i <= rangeCondition3Upper) { //values missing in question, using arbitrary values
			System.out.println("Weird");
		}
		else if(i > rangeCondition4) { //values missing in question, using arbitrary values
			System.out.println("Not Weird");
		}
		/* Alternatively, a single check option
		if(i%2==1 || (i>=rangeCondition2Lower && i<= rangeCondition2Upper){
			System.out.println("Weird");
		} else {
			System.out.println("Not Weird");
		}		 
		*/
		s.close();
	}
}
