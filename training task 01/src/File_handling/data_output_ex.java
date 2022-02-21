package File_handling;
import java.io.*;

public class data_output_ex {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fout1 = new FileOutputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output01.txt");
		DataOutputStream dout1 = new DataOutputStream(fout1);
		
		//ByteArrayOutputStream bo = new ByteArrayOutputStream();
		//String s = "data output!?";
		//byte b[] = s.getBytes();
		dout1.write(65);
		dout1.flush();
		dout1.close();
		fout1.close();
		System.out.println("Done! (part 1)");

	
		FileOutputStream fout2 = new FileOutputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output02.txt");
		DataOutputStream dout2 = new DataOutputStream(fout2);
		dout2.writeInt(42);
		dout2.writeFloat(333.33f);
		dout2.writeLong(3123l);
		//dout2.writeChars("Hello~");
		
		dout2.flush();
		dout2.close();
		fout2.close();
		
		FileInputStream fin = new FileInputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output02.txt");
		DataInputStream din = new DataInputStream(fin);
		
		System.out.println("Int: "+din.readInt());
		System.out.println("Float: "+din.readFloat());
		System.out.println("Long: "+din.readLong());
		//System.out.println("Chars: "+din.readLine());
		din.close();
		fin.close();
		/*
		fin = new FileInputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output02.txt");
		
		BufferedReader bin = new BufferedReader(new InputStreamReader(fin));
		
		while(bin.ready()) {
			System.out.println(bin.readLine());
		}*/
	}

}
