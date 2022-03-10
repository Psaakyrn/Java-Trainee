import java.util.*;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int multiple = 10; // value assumed to be 10 based on output

		Scanner s = new Scanner(System.in);
		System.out.println("Enter value:");
		N=s.nextInt();
		for (int i = 1;i<=multiple;i++) {
			System.out.println(N+" x "+i+" = "+(N*i));
		}
		s.close();
	}

}
