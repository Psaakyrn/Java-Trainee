package functions_and_methods;


class bank {
	String ifsc, address, name;
	int zipcode;
	bank(String ifsc_code,String add,int zip,String bank_name){
		ifsc = ifsc_code;
		address=add;
		zipcode=zip;
		name=bank_name;
	}
	bank(){
		ifsc = "unset";
		address="unset";
		zipcode=0;
		name="unset";
		System.out.println("default constructor, please init variables");
		
	}
	void display() {
		System.out.println("Bank Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("IFSC: "+ifsc);
		System.out.println("Zip Code: "+zipcode);
	}
}


public class bank_ex {
	public static void main(String args[]) {
		bank b1 = new bank();
		bank b2 = new bank("IFSC00101","Heretown",23432,"DSB");
		System.out.println("=== Display bank 1 ===");
		b1.display();
		System.out.println("=== Display bank 2 ===");
		b2.display();
		
		
	}
}
