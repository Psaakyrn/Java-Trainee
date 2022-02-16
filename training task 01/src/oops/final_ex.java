package oops;




public class final_ex {

	String NRI = "SSG43434";
	final String NRI2 = "SSG43434";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final_ex r = new final_ex();
		System.out.println(r.NRI);
		r.NRI = "rewrwe433";
		//r.NRI2 = "rewrwe433";
		System.out.println(r.NRI);
	}

}
