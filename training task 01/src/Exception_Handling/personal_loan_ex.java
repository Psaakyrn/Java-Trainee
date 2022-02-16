package Exception_Handling;
//import java.io.*;

class personal_loan{
	void M() throws NullPointerException 
	{
		//String k = null;
		//System.out.println("k.length = "+k.length());
		
		System.out.println("Device Operation done.");
	}
	protected void finalize() {
		System.out.println("called finalize method");
	}
	
}
class finalize_ex{
	
}

public class personal_loan_ex {
	protected void finalize() {
		System.out.println("called finalize method");
	}
	public static void main(String args[]) throws NullPointerException {
//		personal_loan loanDemo = new personal_loan();
//		loanDemo.M();
//		System.out.println("normal operation");
		personal_loan_ex o = new personal_loan_ex();
		System.out.println("Hashcode is: "+o.hashCode());
		o = null;
		System.out.println("o = null");
		System.gc();
		System.out.println("GC done");
		
	}

}
