package Multi_Thread;

class MyThread1 extends Thread{
	Table T;
	MyThread1(Table t){
		super();
		T = t;
	}
	public void run() {
		T.printTable(3);		
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Thread 1: "+i + " : "+Thread.currentThread().getName());
		}
		
	}
}
class MyThread2 extends Thread{
	Table T;
	MyThread2(Table t){
		super();
		T = t;
	}
	public void run() {
		T.printTable(5);
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Thread 2: "+i + " : "+Thread.currentThread().getName());
		}
	}
}
class MyThread3 extends Thread{
	Table T;
	MyThread3(Table t){
		super();
		T = t;
	}
	public void run() {
		T.printTable(7);
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Thread 3: "+i + " : "+Thread.currentThread().getName());
		}
	}
}

class Table{
	synchronized void printTable(int n) {
		for(int i=0;i<5;i++){
			System.out.println("input "+n+": "+n*i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}	
}

public class without_sync {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Table t0 = new Table();
		MyThread1 T1 = new MyThread1(t0);
		MyThread2 T2 = new MyThread2(t0);
		MyThread3 T3 = new MyThread3(t0);
		
		T3.setPriority(10);
		T2.setDaemon(true);
		T1.start();
		T2.start();
		T3.start();
		//T2.join();

	}

}
