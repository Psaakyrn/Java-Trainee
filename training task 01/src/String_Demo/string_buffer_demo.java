package String_Demo;

public class string_buffer_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.append(" World ");
		System.out.println("sb1: "+sb1);
		
		StringBuffer sb2=new StringBuffer("C++");
		sb1.append(sb2);
		System.out.println("sb2: "+sb2);
		System.out.println("sb1: "+sb1);
		
		String s1 = new String("Hello");
		s1.concat(" World");
		System.out.println("s1: "+s1);
		
		String s2 = new String(" Java");
		s1.concat(s2);
		System.out.println("s1: "+s1);
		
		sb1.insert(3, sb2);
		System.out.println("insert(3, sb2): "+sb1);
		sb1.replace(8,10,"JSP");
		System.out.println("replace(8,10,\"JSP\"): "+sb1);
		sb1.delete(3,6);
		System.out.println("delete(3,6): "+sb1);
		sb1.reverse();
		System.out.println("reverse(): "+sb1);
		//sb1.capacity();
		System.out.println("capacity(): "+sb1.capacity());
		System.out.println("length(): "+sb1.length());
		sb2 = new StringBuffer("++C dlroPSJolleH");
		//System.out.println("sb1: "+sb1);
		//System.out.println("sb2: "+sb2);
		System.out.println("equals(): "+sb1.toString().equals(sb2.toString()));
	}

}
