package File_handling;
import java.io.*;

public class char_arr {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		char[] arr= {'H','e','l','l','o',' ','E','a','r','t','h','\n','B','y','e','~'};
		CharArrayReader rd = new CharArrayReader(arr);
		//CharArrayReader rd2 = new CharArrayReader(arr);
		
		int k = 0;
		
		while((k = rd.read())!= -1) {
			char ch = (char)k;
			System.out.print(ch+": ");
			System.out.println(k);
		}
	}

}
