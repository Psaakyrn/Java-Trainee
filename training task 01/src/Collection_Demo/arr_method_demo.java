package Collection_Demo;
import java.util.*;

public class arr_method_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+++++ ArrayList +++++");
		ArrayList<String> emp = new ArrayList<String>();
		//ArrayList<String> emp = new ArrayList();
		emp.add("Tim");
		emp.add("Toms");
		emp.add("tam");
		emp.add(1,"yumm");
		emp.add(3,"Meee");
		
		System.out.println(emp);
		
		System.out.println();
		System.out.println("+++++ addAll(arr) +++++");
		ArrayList<String> emp2 = new ArrayList<String>();
		emp2.add("Ping");
		emp2.add("pong");
		
		emp.addAll(emp2);
		System.out.println(emp);
		
		System.out.println();
		System.out.println("+++++ addAll(index, arr) +++++");
		ArrayList<String> emp3 = new ArrayList<String>();
		emp3.add("Mid");
		emp3.add("Mud");
		emp3.add("Wuud");
		
		emp.addAll(2,emp3);
		System.out.println(emp);
	
		System.out.println();
		System.out.println("+++++ remove +++++");
		
		emp.remove("Ping");
		System.out.println("After remove: " +emp);
		emp.remove(2);
		System.out.println("After remove(2): " +emp);
		emp.removeAll(emp3);
		System.out.println("After removeAll(emp3): " +emp);
		emp.clear();
		System.out.println("After clear: " +emp);
	
	}

}
