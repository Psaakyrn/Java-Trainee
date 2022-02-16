package Collection_Demo;
import java.util.*;

public class list_ex {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+++++ ArrayList +++++");
		ArrayList emp = new ArrayList();
		//ArrayList<String> emp = new ArrayList();
		emp.add(123);
		emp.add("dsgfds");
		emp.add(new Thread());
		emp.add(43.5324);
		emp.add("Meee");
		
		System.out.println(emp);
		
		Iterator i = emp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Item 2 is: "+emp.get(2));
		
		System.out.println();
		System.out.println("+++++ LinkedList +++++");
		
		LinkedList emp2 = new LinkedList();
		emp2.add(123);
		emp2.add("dsgfds");
		emp2.add(new Thread());
		emp2.add(43.5324);
		emp2.add("Meee");
		
		System.out.println(emp2);
		
		i = emp2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Item 2 is: "+emp.get(2));
		
		System.out.println();
		System.out.println("+++++ Vector +++++");
		
		Vector emp3 = new Vector();
		emp3.add(123);
		emp3.add("dsgfds");
		emp3.add(new Thread());
		emp3.add(43.5324);
		emp3.add("Meee");
		
		System.out.println(emp3);
		
		i = emp3.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Item 3 is: "+emp3.get(2));
		
		System.out.println();
		System.out.println("+++++ Stack +++++");
		
		Stack emp4 = new Stack();
		emp4.push(123);
		emp4.push("dsgfds");
		emp4.push(new Thread());
		emp4.push(43.5324);
		emp4.push("Meee");
		
		System.out.println(emp4);
		emp4.pop();
		i = emp4.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		System.out.println("+++++ ArrayDeque +++++");
		
		ArrayDeque emp5 = new ArrayDeque();
		emp5.add(123);
		emp5.add("dsgfds");
		emp5.add(new Thread());
		emp5.add(43.5324);
		emp5.add("Meee");
		
		System.out.println(emp5);
		
		i = emp5.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		emp5.addFirst("firstAdd");
		emp5.addLast("lastAdd");
		System.out.println("-- added items --");
		i = emp5.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		System.out.println();
		System.out.println("+++++ PriorityQueue +++++");
		
		PriorityQueue emp6 = new PriorityQueue();
		emp6.add(123);
		emp6.add(68778);
		emp6.add(43653);
		emp6.add(43);
		emp6.add(563452);
		
		System.out.println(emp6);
		
		i = emp6.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	
	
	}

}
