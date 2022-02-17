package Collection_Demo;
import java.util.*;

public class linked_list_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<String> l1 = new LinkedList<String>();
			l1.add("Tim");
			l1.add("tam");
			l1.add("tam");
			l1.add("Tim");
			System.out.println("After add: "+l1);
			
			l1.add(1,"yumm");
			l1.add(3,"Meee");
			System.out.println("After add(index): "+l1);
			
			System.out.println("+++++ addAll(arr) +++++");
			LinkedList<String> l2 = new LinkedList<String>();
			l2.add("Ping");
			l2.add("pong");
			
			l1.addAll(l2);
			System.out.println(l1);
			
			System.out.println();
			System.out.println("+++++ addAll(index, arr) +++++");
			LinkedList<String> l3 = new LinkedList<String>();
			l3.add("Mid");
			l3.add("Mud");
			l3.add("Wuud");
			
			l1.addAll(2,l3);
			System.out.println(l1);
		
			System.out.println();
			System.out.println("+++++ remove +++++");
			
			l1.remove("Ping");
			System.out.println("After remove: " +l1);
			l1.remove(2);
			System.out.println("After remove(2): " +l1);
			l1.removeAll(l3);
			System.out.println("After removeAll(emp3): " +l1);
			l1.removeFirstOccurrence("Tim");
			System.out.println("After removeFirstOccurrence(\"Tim\"): " +l1);			
			l1.removeLastOccurrence("tam");
			System.out.println("After removeLastOccurrence(\"tam\"): " +l1);			
			l1.clear();
			System.out.println("After clear: " +l1);			
	}

}
