package File_handling;
import java.io.*;

public class file_input {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output01.txt");
			int i = 0;
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(Exception e) {
			System.err.println(e);
			
		}
		
	}
}
