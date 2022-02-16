package Multi_Thread;
import java.util.*;

public class runnable_ex implements Runnable{

	public void run() {
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter value:");
		int n = s.nextInt();
		for(int i=0; i<n; i++){
			System.out.println("i^2 : "+i*i);
		}
		s.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			runnable_ex run = new runnable_ex();
			Thread t = new Thread(run, "new Thread");
			t.start();
			
			System.out.println(t.getName());
	}

}
