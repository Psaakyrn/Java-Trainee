package File_handling;
import java.io.*;

public class sequence_input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin1 = new FileInputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output01.txt");
		FileInputStream fin2 = new FileInputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output02.txt");
			
		SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
		
		int i;
		while((i=sin.read())!= -1) {
			System.out.print((char)i);
		}
		sin.close();
		fin1.close();
		fin2.close();
		System.out.println();
		System.out.println("done~");
		
	}

}
