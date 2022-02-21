package File_handling;
import java.io.*;

public class file_output_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output.txt");
			fout.write(90);
			fout.close();
		
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}

}
