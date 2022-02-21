package File_handling;
import java.io.*;

public class char_arr_writer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("Wirte this character (array) demo.");
		
		String file_loc = "C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\";
		
		FileWriter fw1 = new FileWriter(file_loc+"caw01.txt");
		FileWriter fw2 = new FileWriter(file_loc+"caw02.txt");
		FileWriter fw3 = new FileWriter(file_loc+"caw03.txt");
		FileWriter fw4 = new FileWriter(file_loc+"caw04.txt");
		FileWriter fw5 = new FileWriter(file_loc+"caw05.txt");
		
		caw.writeTo(fw1);
		caw.writeTo(fw2);
		caw.writeTo(fw3);
		caw.writeTo(fw4);
		caw.writeTo(fw5);
		
		fw1.close();
		fw2.close();
		fw3.close();
		fw4.close();
		fw5.close();
		
		caw.close();
		
		System.out.println("Executed.");
		
	}

}
