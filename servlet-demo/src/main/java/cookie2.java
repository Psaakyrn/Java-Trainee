
import java.io.*;
import java.net.URLDecoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookie2
 */
public class cookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

		String name="default";

		Cookie ck[]=request.getCookies();  
		if(ck!=null) {
			for(int i=0;i<ck.length;i++) {
				if(ck[i].getName().equals("uName"))
				{
					name = URLDecoder.decode(ck[i].getValue(), "UTF-8") ;
					pw.print("hello "+name );

					break;
				}
			}
			
		}
		if(name.equals("default"))
		{
			pw.print("No proper name detected. ");
		}
		pw.close();
	}

}
