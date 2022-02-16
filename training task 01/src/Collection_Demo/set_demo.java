package Collection_Demo;
import java.util.*;

public class set_demo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("+++++ HashSet +++++");
		
		HashSet set1 = new HashSet();
		set1.add(123);
		set1.add("dsgfds");
		set1.add("new Thread()");
		set1.add(null);
		set1.add(43.5324);
		set1.add("Meee");
		
		System.out.println(set1);
		
		Iterator i = set1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println();
		System.out.println("+++++ ArrayList +++++");
		ArrayList<String> emp1 = new ArrayList();
		emp1.add("1212");
		emp1.add("Cook");
		emp1.add("Book");
		emp1.add("Dook");
		emp1.add("????!?");
		
		for(String oo:emp1) {
			System.out.println(oo);
		}
		
		Collections.sort(emp1);
		System.out.println("After sort:");
		for(String oo:emp1) {
			System.out.println(oo);
		}
		
	
		
	}

}
