package File_handling;
import java.io.*;

class userFilter extends FilterWriter
{
	userFilter(Writer out){
		super(out);
	}
	
	public void write(String str) throws IOException{
		super.write(str.toLowerCase());
	}
}

public class file_writer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String file_loc = "C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\";
		FileWriter fw = new FileWriter(file_loc+"filter_ex.txt");
		userFilter uf = new userFilter(fw);
		
		uf.write("hElLo WoRlD");
		uf.close();
		
		FileReader fr = new FileReader(file_loc+"filter_ex.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char)i);
		}
		br.close();
	}

}
