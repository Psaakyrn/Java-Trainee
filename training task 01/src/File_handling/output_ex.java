package File_handling;

public class output_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Earth");
		try {
			int i = 1/0;
			System.out.println("i = "+i);
		}
		catch(Exception e){
			System.err.println("error stuff: "+e);
		}

	}

}
