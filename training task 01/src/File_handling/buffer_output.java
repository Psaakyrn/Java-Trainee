package File_handling;
import java.io.*;

public class buffer_output {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output01.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "File output using buffered output stream.";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success~");		
	}

}
