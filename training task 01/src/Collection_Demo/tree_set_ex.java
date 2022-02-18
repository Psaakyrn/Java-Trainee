package Collection_Demo;

import java.util.*;

public class tree_set_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+++++ TreeSet +++++");
		TreeSet<String> emp1 = new TreeSet<String>();
		emp1.add("1212");
		emp1.add("Cook");
		emp1.add("Book");
		emp1.add("Dook");
		emp1.add("Dook");
		//emp1.add(null); // -- Tree set cannot accept null
		emp1.add("????!?");
		
		System.out.println("Base: "+emp1);
		emp1.remove("Book");
		System.out.println("After remove(): "+emp1);
		
		TreeSet<String> emp2 = new TreeSet<String>();
		emp2.add("Dook");
		emp2.add("bbbbbb");
		emp1.addAll(emp2);
		System.out.println("After addAll(): "+emp1);
		
		emp1.removeAll(emp2);
		System.out.println("After removeAll(): "+emp1);
	
		emp1.clear();
		System.out.println("After clear(): "+emp1);
	
	}

}
