package File_handling;
import java.io.*;

public class file_output1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output01.txt");
			byte b[];
			String msg;
			msg= "01: Save this message. Once.";
			b = msg.getBytes();
			fout.write(b);
			msg = "\n02: Save this message. Again.";
			b = msg.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success");
		}
		catch(Exception e) {
			System.err.println(e);
		}

	}

}
