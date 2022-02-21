package File_handling;
import java.io.*;

public class buffered_input {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output01.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!= -1) {
			System.out.print((char)i);
		}
		bin.close();
		fin.close();
		System.out.println();
		System.out.println("done~");
	}

}
