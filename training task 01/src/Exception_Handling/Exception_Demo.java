package Exception_Handling;

public class Exception_Demo {
	public static void main(String args[]) {
		int j;
		try {
			j = 10/0;
		//} catch(RuntimeException e) {
		} catch(ArithmeticException e) {
			System.out.println("Error = "+e.getMessage()+", setting j = -99");
			j = -99;
		}
		System.out.println("j/0 = "+j);
		
		String k = "k";
		try {
			j= k.length();			
			//} catch(Exception e) {
		} catch(NullPointerException e) {
			System.out.println("Error = "+e.getMessage()+", setting j = -88");
			j=-88;
		}
		System.out.println("length of k is = "+j);
		
		try {
			//k="9.9";	
			j=Integer.parseInt(k);
		//} catch(Exception e) {
		} catch(NumberFormatException e) {
			System.out.println("Error = "+e.getMessage()+", setting j = -77");
			j=-77;
		}
		System.out.println("k is = "+j);
		
		
		j=99;
		k = null;
		int[]l = new int[22];
		try {
			l[j]=j;
			System.out.println("code after error"); // does NOT execute.
			j=Integer.parseInt(k);// does NOT execute.
		//} catch(Throwable e) {
		} catch(NumberFormatException e) {
			System.out.println("NumFormatError = "+e.getMessage()+", setting j = 4");
			j = 4;
			l[j]=j;
		} catch(IndexOutOfBoundsException e) {
		System.out.println("IndexError = "+e.getMessage()+", setting j = 4");
		j = 4;
		l[j]=j;
		} catch(Throwable e) {
			System.out.println("ThrowableError = "+e.getMessage()+", setting j = 4");
		}
		System.out.println("l[j] = "+l[j]);
	}
}
