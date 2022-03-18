

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name="default";
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Login Page (continued)</title>");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("<form action='login3' method='post'>");
		pw.println("UserName: <input type='text' name='userName' value='"+name+"'><br><br>");
		pw.println("Password: <input type='password' name='pass'><br><br>");
        pw.println("<input type='submit' value='Second page go'>");  
        pw.println("</form>");  
        pw.println("</body>");  
        pw.println("</html>");  
      
        pw.close();
	}
*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
				
		String n = request.getParameter("userName");
		String p = request.getParameter("pass");
		
		//if("Admin Name".equals(n) && "Admin Pass".equals(p))//make proper use and password check
		if("Admin Pass".equals(p))//make proper use and password check
		{
			//RequestDispatcher  rd = request.getRequestDispatcher("/hidden_form.html");
			//rd.forward(request, response);	
			Cookie ck = new Cookie("uName",URLEncoder.encode( n, "UTF-8" ));
			ck.setMaxAge(-1);
			response.addCookie(ck);
			pw.println("Thank you for logging in, "+n);
		}
		else
		{
			pw.println("Wrong password");
			pw.println("<br><a href='loginPage.html'>Back to Login</a>");
		}
		pw.println("<br><a href='homePage.html'>Back to homepage</a>");
     
        pw.close();
	}

}
