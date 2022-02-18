package String_Demo;

public class string_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String msg = new String("hello earth");
		int reg = 105;
		double mark = 34.8;*/

		String s1 = "Hello Earth";
		String s2 = new String("Hello Earth");
		String s3 = "Hello Earth";
		String s4 = "Welcome Java";
		String s5 = "Welcome Java";
		
		System.out.println("Literal: "+s1);
		System.out.println("keyword: "+s2);
		
		System.out.println("=== concat ===");
		s1=s1.concat(" dwellers");
		s2+=" dwellers";
		System.out.println("Literal: "+s1);
		System.out.println("keyword: "+s2);
		
		System.out.println("=== equals ===");
		s1 = "Hello Earth";
		s2 = "Hello Earth";
		s3 = new String("Hello Earth");
		s4 = "hello earth";
		s5 = "hello marth";

		System.out.println("s2: "+s1.equals(s2));
		System.out.println("s3: "+s1.equals(s3));
		System.out.println("s4: "+s1.equals(s4));
		
		System.out.println("s3(equalsIgnoreCase): "+s1.equalsIgnoreCase(s3));
		System.out.println("s4(equalsIgnoreCase): "+s1.equalsIgnoreCase(s4));
		System.out.println("s5(equalsIgnoreCase): "+s1.equalsIgnoreCase(s5));
		
		System.out.println("=== numbers ===");
		int a = 100;
		s1 = "20";
		int c = 3;
		System.out.println(a+c);
		System.out.println(a+s1);
		System.out.println(s1+c);
		System.out.println(s1.concat("55"));
		System.out.println("=== substring ===");
		s1="Welcome to Halloween  ";
		s2="  Welcome to Christmas";
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("substring(12): "+s1.substring(12));
		System.out.println("substring(3,15): "+s1.substring(3,15));
		System.out.println("toUpperCase(): "+s1.toUpperCase());
		System.out.println("toLowerCase(): "+s2.toLowerCase());
		System.out.println("trim(): "+s1.trim()+s2.trim());
		System.out.println("startsWith(\"Welcome\"): "+s2.trim()+" : "+s2.trim().startsWith("Welcome"));
		System.out.println("startsWith(\"welcome\"): "+s2.trim()+" : "+s2.trim().startsWith("welcome"));
		System.out.println("endssWith(\"ween\"): "+s1+" : "+s1.endsWith("ween"));
		System.out.println("trim(),endssWith(\"ween\"): "+s1.trim()+" : "+s1.trim().endsWith("ween"));
		System.out.println("charAt(11): "+s2.charAt(11));
		System.out.println("length(): "+s2.length());

	
		
		
	}

}
