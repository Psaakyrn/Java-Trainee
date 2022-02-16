package oops;

class Address{
	String city, state, country;
	Address(String in_city, String in_state, String in_country){
		this.city = in_city;
		this.state = in_state;
		this.country = in_country;
	}
}
class Emp{
	int id;
	String name;
	Address address;
	
	Emp(int in_id, String in_name, Address in_address)
	{
		this.id = in_id;
		this.name = in_name;
		this.address = in_address;
	}
	
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}
}

class InternationalStudent extends Student{
	Address address;
	InternationalStudent(int input_regNo, String input_name,int m1, int m2, int m3, Address newAddr){
		super(input_regNo, input_name,m1, m2, m3);
		address = newAddr;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Registered code: "+regNo);
		System.out.println("Address: "+address.city + " " + address.state + " " + address.country);
		
		System.out.println("Mark 1: "+mark1);
		System.out.println("Mark 2: "+mark2);
		System.out.println("Mark 3: "+mark3);
		System.out.println("Total: "+tot);
		System.out.println("Average: "+avg);
		
	}
	
}

public class aggregate_ex {
	public static void main(String args[]) {
		Address addr1 = new Address("gbz","UP","Singapore");
		Address addr2 = new Address("gbo","OP","India");
		Address addr3 = new Address("gbq","AP","USA");
		
		Emp e1 = new Emp(111,"Tim",addr1);
		Emp e2 = new Emp(222,"Tam",addr2);
		Emp e3 = new Emp(333,"Tom",addr3);
		
		e1.display();
		e2.display();
		e3.display();
		
		InternationalStudent stud1 = new InternationalStudent(123,"Jon",56,67,78,addr1);
		System.out.println("=== Student display test ===");
		stud1.display();
	}

}
