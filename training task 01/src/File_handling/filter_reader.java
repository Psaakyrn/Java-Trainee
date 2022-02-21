package File_handling;
import java.io.*;

class userFilterReader extends FilterReader
{
	userFilterReader(Reader rin){
		super(rin);
	}
	
	public int read() throws IOException{
		int i = super.read();
		if((char)i ==' ')return (int)'?';
		else {
			if(i>=65 && i <= 90)i+=32;
			return i;
		}
	}
}
public class filter_reader {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file_loc = "C:\\Users\\Psaakyrn\\git\\Java-Trainee\\training task 01\\src\\File_handling\\";
		try {
			Reader rd = new FileReader(file_loc+"filter_ex.txt");
			userFilterReader ufr = new userFilterReader(rd);
			int i;
			while((i=ufr.read())!=-1) {
				System.out.print((char)i);
			}
			ufr.close();
			rd.close();
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
