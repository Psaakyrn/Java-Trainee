package Collection_Demo;
import java.util.*;

public class priority_queue_demo {
	public static void main(String args[]) {
		
		System.out.println("+++++ PriorityQueue +++++");
		
		PriorityQueue<String> emp6 = new PriorityQueue<String>();
		emp6.add("EEE");
		emp6.add("AAA");
		emp6.add("BBB");
		emp6.add("DDD");
		emp6.add("BBB");
		emp6.add("CCC");
		
		System.out.println("base: "+emp6);
		
		System.out.print("Iteration:");
		Iterator<String> i = emp6.iterator();
		while(i.hasNext()) {
			System.out.print(" "+i.next());
		}
		System.out.println();
		System.out.println("Head: "+emp6.element());
		System.out.println("Head: "+emp6.peek());
		
		emp6.poll();
		System.out.println("poll(): "+emp6);
		emp6.remove();
		System.out.println("remove(): "+emp6);
		
		System.out.print("Iteration:");
		i = emp6.iterator();
		while(i.hasNext()) {
			System.out.print(" "+i.next());
		}
		System.out.println();
		System.out.println("+++++ PriorityQueue Book +++++");
		PriorityQueue<Book> list = new PriorityQueue<Book>();
		list.add(new Book(104,"C Game 3","Tom","DA Co",7));
		list.add(new Book(105,"C Game 3","Tom","DA Co",7));
		list.add(new Book(101,"C Game 1","Tim","AB Co",7));
		list.add(new Book(102,"C Game 2","Tam","BC Co",7));
		list.add(new Book(103,"C Game 1","Tim","AB Co",7));
		
		for(Book b:list) {
			//list.removeLast();
			System.out.println("Book "+b.id+":\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.nos);
		}
		Book bb = list.element();
		System.out.println("Head: ");
		System.out.println("Book "+bb.id+":\t"+bb.name+"\t"+bb.author+"\t"+bb.publisher+"\t"+bb.nos);
		bb = list.poll();
		System.out.println("poll():");
		System.out.println("Book "+bb.id+":\t"+bb.name+"\t"+bb.author+"\t"+bb.publisher+"\t"+bb.nos);
		System.out.println("Current list");
		for(Book b:list) {
			//list.removeLast();
			System.out.println("Book "+b.id+":\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.nos);
		}
		
	}
}
