package Multi_Thread;
import java.util.*;

class task1 extends Thread{
	Scanner s;
	int taskNum;
	public void run() {
		System.out.println("enter N:");
		int n = s.nextInt();
		for (int i=0;i<n;i++){
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			if(i%2==0) {
				System.out.println("Task "+taskNum+": "+i+" : "+i*i);
			}
			else
			{
				System.out.println("Task "+taskNum+": "+i+" : SKIP");
			}
		}
	}
	task1(int in, Scanner ss){
		taskNum = in;
		s = ss;
	}
	
}
class task2 extends Thread{
	Scanner s;
	int taskNum;
	public void run() {
		//Scanner s = new Scanner(System.in);
		System.out.println("enter N:");
		int n = s.nextInt();
		for (int i=0;i<n;i++){
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			if(i%2==0) {
				System.out.println("Task "+taskNum+": "+i+" : SKIP");
			}
			else
			{
				System.out.println("Task "+taskNum+": "+i+" : "+i*i*i);
			}
		}
	}
	task2(int in, Scanner ss){
		taskNum = in;
		s = ss;
	}
}
	class task3 extends Thread{
		Scanner s;
		int taskNum;
		public void run() {
			System.out.println("enter N:");
			int n = s.nextInt();
			try {
				Thread.sleep(50);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			for (int i=0;i<n;i++){
				System.out.println("+++++++++++");
				try {
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
		task3(int in, Scanner ss){
			taskNum = in;
			s = ss;
		}
		
}

public class multi_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		task1 T1 = new task1(1,s);
		task2 T2 = new task2(2,s);
		task1 T3 = new task1(3,s);
		task3 T4 = new task3(4,s);
		T1.setPriority(1);
		T2.setPriority(5);
		T3.setPriority(10);
		T4.setPriority(5);
		T1.start();
		T2.start();
		T3.start();
		T4.start();
		s.close();

	}

}
