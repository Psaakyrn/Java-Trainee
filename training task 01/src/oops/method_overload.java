package oops;

class demo{
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a*b*c;
	}
	double add(double a, double b) {
		return a*b;
	}
}
public class method_overload {
	public static void main(String args[]) {
		demo d = new demo();
		
		System.out.println(d.add(1, 2));
		System.out.println(d.add(3, 4, 5));
		System.out.println(d.add(3.0, 4.0));
	}
}
