

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

/**
 * Servlet implementation class homePage
 */
public class homePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name="";
		Boolean isLogged=false;

		Cookie ck[]=request.getCookies();  
		if(ck!=null) {
			for(int i=0;i<ck.length;i++) {
				if(ck[i].getName().equals("uName"))
				{
					name = URLDecoder.decode(ck[i].getValue(), "UTF-8") ;
					isLogged=true;
					break;
				}
			}
			
		}
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Login Page</title>");
		pw.println("<head>");
		pw.println("<body>");
		if(isLogged) {
			pw.println("<h2>Welcome, "+name+"</h2>");
		}
		else {
			pw.println("<h2>Welcome, please log in.</h2>");
		}
		if(isLogged) {
			pw.println("<br><br><a href='logout.html'>Log Out</a> | ");
			
			pw.println("<form  action='servlet_1'>");
			pw.println("<input type='text' name='userName'>");
			pw.println("<input type='submit'>");
			pw.println("</form>");
			
		}
		else {
			pw.println("<br><br><a href='loginPage.html'>Log In</a>");
		}		
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

}
