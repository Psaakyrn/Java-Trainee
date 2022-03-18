

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

/**
 * Servlet implementation class LogOut
 */
public class LogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name="default";
		
		Cookie ck[]=request.getCookies();  
		if(ck!=null) {
			for(int i=0;i<ck.length;i++) {
				if(ck[i].getName().equals("uName"))
				{
					name=URLDecoder.decode(ck[i].getValue(), "UTF-8");
					ck[i].setMaxAge(0);
					response.addCookie(ck[i]);
					break;
				}
			}
			
		}
		
		pw.println("Thank you for logging out, "+name);
		
		pw.println("<br><a href='homePage.html'>Back to homepage</a>");
	}

}
