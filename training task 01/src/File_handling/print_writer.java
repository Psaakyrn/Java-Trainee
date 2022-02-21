package File_handling;
import java.io.*;

public class print_writer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String file_loc = "C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\";
		PrintWriter pw = new PrintWriter(System.out);
		pw.write("Print this in console");
		
		pw.flush();
		pw.close();
		
		pw = null;
		
		pw = new PrintWriter(new File(file_loc+"pwfile.txt"));
		pw.write("PrintWriter entering a line");
		pw.write("\nPrintWriter entering another line");
		pw.flush();
		pw.close();
	}

}
