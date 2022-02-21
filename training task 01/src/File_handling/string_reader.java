package File_handling;
import java.io.*;

public class string_reader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s = "This is a silly string.";
		
		StringReader sr = new StringReader(s);
		
		int i = 0;
		
		while((i=sr.read())!=-1) {
			System.out.print((char)i);
		}
	}

}
