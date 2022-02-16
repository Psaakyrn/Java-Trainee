package oops;
import functions_and_methods.arith;

class parent extends arith{
	protected int sample = 10;
	public void show() {
		System.out.println("sample from parent class: " +sample);
	}
	public int calc(int a, int b) {
		return a+b;
	}
	public int calc(int a, int b, int c) {
		return a+b+c;
	}
	public double calc(double a, double b, double c) {
		return a+b+c;
	}
}
class child extends parent{
	
	public void show() {
		System.out.println("sample from child class: " +sample);
	}
	public int calc(int a, int b) {
		return a-b;
	}
	public int calc(int a, int b, int c) {
		return a*b*c;
	}
	public double calc(double a, double b, double c) {
		return a*b/c;
	}
}
public class overriding {
	public static void main(String args[]) {
		parent obj1 = new parent();
		parent obj2 = new child();
		System.out.println(" == obj1 == ");
		obj1.show();
		System.out.println("calc 2, 3 = "+obj1.calc(2, 3));
		System.out.println("calc 2, 3, 4 = "+obj1.calc(2, 3, 4));
		System.out.println("calc 2.0, 3.0 = "+obj1.calc(2, 3));
		System.out.println(" == obj2 == ");
		obj2.show();
		System.out.println("calc 2, 3 = "+obj2.calc(2, 3));
		System.out.println("calc 2, 3, 4 = "+obj2.calc(2, 3, 4));
		System.out.println("calc 2.0, 3.0 = "+obj2.calc(2, 3));
		System.out.println("mul = "+obj1.mul());
	
		
	}
}
