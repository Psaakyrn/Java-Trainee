package Exception_Handling;
import java.io.*;

@SuppressWarnings("serial")
class invalidAgeException extends Exception
{
    public invalidAgeException(String str)
    {
        super(str);
    }
}
class custom_exception {

    static void validate(int age) throws invalidAgeException
    {
        if(age<18)
        {
            throw new invalidAgeException("Age is not valid for vote ");
        }
        else
        {
        System.out.println("welcome to vote");    
        }
    }
}
class Parent {
	void msg() throws IOException{
		System.out.println("parent message");
	}
}
public class override_ex  extends Parent{
	
	/*
	void msg()throws IOException{
		System.out.println("child message");
	}
	*/

	@SuppressWarnings("static-access")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//Parent p = new override_ex();
		custom_exception q = new custom_exception();
		//try {
			//p.msg();
		//} catch(Exception e)
		//{
			
		//}
			try
	        {
	            q.validate(13);
	        }catch(invalidAgeException e)
	        {
	            System.out.println(e);
	        }
	        System.out.println("Rest of the code");
	}

}
