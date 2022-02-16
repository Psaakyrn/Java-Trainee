package Exception_Handling;

public class Throw_ex {
	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied - 18 age req");
		}
		else {
			System.out.println("age req fit");
		}
	}
	static void checkMark(int mark) {
		if(mark<50) {
			throw new ArithmeticException("Failed, Mark has to be 50 and above to pass");
		}
		else {
			System.out.println("Passed~");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(15);
	}

}
