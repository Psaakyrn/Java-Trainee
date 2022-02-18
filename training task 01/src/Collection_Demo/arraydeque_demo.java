package Collection_Demo;

import java.util.Iterator;
import java.util.*;

public class arraydeque_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+++++ ArrayDeque +++++");
		
		ArrayDeque<String> emp6 = new ArrayDeque<String>();
		emp6.add("EEE");
		emp6.add("AAA");
		emp6.add("BBB");
		emp6.add("DDD");
		emp6.add("BBB");
		emp6.add("CCC");
		emp6.offer("FFF");
		emp6.offerFirst("GGG");
		
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
		
		i = emp6.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}	
		System.out.println("+++++ ArrayDeque Book +++++");
		ArrayDeque<Book> list = new ArrayDeque<Book>();
		list.add(new Book(104,"C Game 3","Tom","DA Co",7));
		list.add(new Book(105,"C Game 3","Tom","DA Co",7));
		list.add(new Book(101,"C Game 1","Tim","AB Co",7));
		list.add(new Book(102,"C Game 2","Tam","BC Co",7));
		list.add(new Book(103,"C Game 1","Tim","AB Co",7));
		list.offer(new Book(106,"C Game 2","Tam","BC Co",7));
		list.offerFirst(new Book(107,"C Game 2","Tam","BC Co",7));
		
		for(Book b:list) {
			//list.removeLast();
			System.out.println("Book "+b.id+":\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.nos);
		}
		Book bb = list.peek();//returns null if empty
		//list.element();//list.getFirst(); - throws error if empty
		System.out.println("Head: ");
		System.out.println("Book "+bb.id+":\t"+bb.name+"\t"+bb.author+"\t"+bb.publisher+"\t"+bb.nos);
		bb = list.getLast();
		System.out.println("Tail: ");
		System.out.println("Book "+bb.id+":\t"+bb.name+"\t"+bb.author+"\t"+bb.publisher+"\t"+bb.nos);
		bb = list.poll();//returns null if empty
		//list.pop();//list.remove(); - throws error if empty
		System.out.println("poll():");
		System.out.println("Book "+bb.id+":\t"+bb.name+"\t"+bb.author+"\t"+bb.publisher+"\t"+bb.nos);
		System.out.println("Current list");
		for(Book b:list) {
			System.out.println("Book "+b.id+":\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.nos);
		}
		list.pollLast();//list.removeLast();
		System.out.println("Current list after remove()");
		for(Book b:list) {		
			System.out.println("Book "+b.id+":\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.nos);
		}
	}

}
