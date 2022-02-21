package File_handling;
import java.io.*;

public class writer_ex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer w = new FileWriter("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output02.txt");
		String msg = "Write this data";
		w.write(msg);
		w.close();
		
		System.out.println("done");
		FileReader r = new FileReader("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output02.txt");
		
		int data;
		//int data=r.read();
		while((data=r.read())!=-1) {
		System.out.print((char)data);
		
		//data=r.read();
		}
		r.close();
		System.out.println();
		System.out.println("Done (part 1)");
		
		
		w = new FileWriter("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output03.txt");
		BufferedWriter bout = new BufferedWriter(w);
		
		bout.write("This is a different data.");
		bout.write("\nAnd another line~");
		bout.close();
		w.close();
		System.out.println("Done (part 2)");
	}

}
