package Multi_Thread;

public class thread_demo extends Thread {

	public void run() {
		System.out.println("Thread is running");
		for (int i=0;i<20;i++) {
			if(i%2==0) {
				System.out.println("i = "+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_demo obj = new thread_demo();
		obj.start();

	}

}
