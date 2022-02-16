package oops;

abstract class bank{
	abstract int roi();
	void show() {
		System.out.println("Abstract class show(): is bank");
	}
	
}

abstract class Shape{
	abstract void draw();
	static int count = 0;
	Shape(){
		count++;
		System.out.println("Shape count: "+ count);
	};
	
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a circle~");
	}
	Circle(){
		System.out.println("Creating Circle~");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing a square~");
	}
	Square(){
		System.out.println("Creating Square~");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a rectangle~");
	}
	Rectangle(){
		System.out.println("Creating Rectangle~");
	}
}

class HDFC extends bank{
	int roi() {
		return 52;
	}
}
class DDC extends bank{
	int roi() {
		return 32;
	}
	void show() {
		System.out.println("Implemented class show(): is bank DDC");
	}
}

public class Abs_ex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank bankList[] = new bank[2];
		bankList[0] = new HDFC();
		bankList[1] = new DDC();
		bankList[0].show();
		System.out.println("ROI: "+bankList[0].roi());
		bankList[1].show();
		System.out.println("ROI: "+bankList[1].roi());
		Shape shapeList[] = new Shape[3];
		//Shape test = new Square();
		shapeList[0] = new Circle();
		shapeList[1] = new Square();
		shapeList[2] = new Rectangle();
		for (int i=0;i<3;i++) {
			shapeList[i].draw();
		}
	}
}
