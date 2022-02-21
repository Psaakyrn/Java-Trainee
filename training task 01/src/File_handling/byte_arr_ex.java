package File_handling;
import java.io.*;

public class byte_arr_ex {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fout1 = new FileOutputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output01.txt");
		FileOutputStream fout2 = new FileOutputStream("C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\output02.txt");

		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		String s = "double output??";
		byte b[] = s.getBytes();
		bo.write(b);
		bo.writeTo(fout1);
		bo.writeTo(fout2);
		bo.flush();
		bo.close();
		//DataOutputStream dout = new DataOutputStream(null);
		fout1.close();
		fout2.close();
		System.out.println("complete!");
	}

}
