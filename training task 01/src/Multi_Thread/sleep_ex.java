package Multi_Thread;
import java.util.*;

class daemon_ex extends Thread{
	int tNum;
	public void run() {
		for(int i=0;i<1000;i++){
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("-- Thread "+tNum+": "+i + " : "+Thread.currentThread().getName()+" --");
		}
	}
	daemon_ex(int j){
		super();
		tNum = j;
	}
}
class sleep_demo extends Thread{
	int tNum;
	int aNum = 0;
	Scanner s;
	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Thread "+tNum+": "+i + " : "+Thread.currentThread().getName());
		}
		System.out.println("Input num: ");
		aNum = s.nextInt();
	}
	sleep_demo(int j, Scanner ss){
		super();
		s = ss;
		tNum = j;
	}
	public int getNum() {
		return aNum;
	}
}
public class sleep_ex extends Thread{
/*	
	int tNum;
	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Thread "+tNum+": "+i + " : "+Thread.currentThread().getName());
		}
		
	}
	sleep_ex(int j){
		super();
		tNum = j;
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		daemon_ex T1 = new daemon_ex(1);
		sleep_demo T2 = new sleep_demo(2, s);
		sleep_demo T3 = new sleep_demo(3, s);
		
		T1.setPriority(2);
		T2.setPriority(8);
		T3.setPriority(5);
		
		T1.setDaemon(true);
		T1.start();
		/*
		try {
			T1.join();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		*/
		System.out.println("T1: "+T1.getName()+" : "+T1.getPriority());
		System.out.println("T2: "+T2.getName()+" : "+T2.getPriority());
		T2.start();
		
		try {
			//Thread.sleep(2000);
			T2.join();
			System.out.println("T2 result is: "+T2.getNum());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		T3.start();
	
		try {
			T3.join();
			System.out.println("T3 result is: "+T3.getNum());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		s.close();
//		T3.start();
		
//		System.out.println("T3: "+T3.getName()+" : "+T3.getPriority());
		return;
	}

}
