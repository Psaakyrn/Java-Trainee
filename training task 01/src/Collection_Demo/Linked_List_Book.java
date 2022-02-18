package Collection_Demo;
import java.util.*;

class Book implements Comparable<Book>{
	int id;
	String name,author,publisher;
	int nos;
	public Book(int id_, String name_, String author_, String publisher_, int nos_) {
		id = id_;
		name = name_;
		author = author_;
		publisher = publisher_;
		nos = nos_;
	}
	public int compareTo(Book b)
	{
		if(id == b.id) {
			return 0;
		}
		else if(id > b.id)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class Linked_List_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> list = new LinkedList<Book>();
		list.add(new Book(101,"C Game 1","Tim","AB Co",7));
		list.add(new Book(102,"C Game 2","Tam","BC Co",7));
		list.add(new Book(103,"C Game 1","Tim","AB Co",7));
		list.add(new Book(104,"C Game 3","Tom","DA Co",7));
		
		for(Book b:list) {
			//list.removeLast();
			System.out.println("Book "+b.id+":\t"+b.name+"\t"+b.author+"\t"+b.publisher+"\t"+b.nos);
		}
	}

}
