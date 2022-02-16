package oops;
import java.util.*;

interface courses{
	int course_fee();
}

abstract class courses_A implements courses{
	protected int id;
	protected String name ;
	protected int fee;
	public int course_fee() {
		return fee;
	}
	public String getName()
	{
		return name;
	}
	public int getID()
	{
		return id;
	}
	
}

class B_Tech extends courses_A{
	B_Tech(){
		id = 11;
		name = "Biotech";
		fee = 21;
	}
}
class M_Tech extends courses_A{
	M_Tech(){
		id = 12;
		name = "Medical Tech";
		fee = 22;
	}
}
class Medical extends courses_A{
	Medical(){
		id = 13;
		name = "Medical";
		fee = 23;
	}
}
public class courses_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		courses C_A = new B_Tech();
		courses C_B = new M_Tech();
		courses C_C = new Medical();
		*/
		Scanner s = new Scanner(System.in);
		int courseTotal = -1;
		String courseGroup[];
		System.out.print("Input number of courses: ");
		courseTotal = s.nextInt();
		s.nextLine();
		if(courseTotal>0) {
			System.out.println("========");
			courseGroup = new String[courseTotal];
			for (int i=0;i<courseTotal;i++) {
				System.out.print("Input course "+(i+1)+" name: ");
				courseGroup[i] = s.nextLine();
			}
			System.out.println("========");
			System.out.println("= Displaying "+courseTotal+" Course(s) =");		
			for (int i=0;i<courseTotal;i++) {
				System.out.println("Course "+(i+1)+" name: " + courseGroup[i]);
			}
		}
		else {
			System.out.println("= Invalid input =");		
		}
		s.close();
	}

}
