package oops;
//import java.util.*;
/*
interface bank_1{
	long acc_no = 34243234L;
	int roi();
}

class DDB implements bank_1{
	public int roi() {
		return 2;
	}
}
*/
interface printer{
	void print();
}

interface scanner extends printer{
	void scan();
	static int cube(int n) {
		return n*n*n;
	}
}

class interface_demo implements scanner{
	String savedstring;
	public void print() {
		System.out.println("printing");
	}
	public void scan() {
		System.out.println("scanning");
	}
	void msg(){
		System.out.println("messaging");
	}
}



public class interface_ex {
	public static void main(String args[]) {
		/*
		DDB newB = new DDB();
		System.out.println("bank roi: "+newB.roi());
		//bank_1.acc_no = 111111L;
		System.out.println("account no: "+newB.acc_no);
		*/
		interface_demo demo_A = new interface_demo();
		demo_A.print();
		demo_A.scan();
		demo_A.msg();
	}
}
