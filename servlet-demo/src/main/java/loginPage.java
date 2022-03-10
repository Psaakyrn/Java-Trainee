

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class loginPage
 */
public class loginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Login Page (continued)</title>");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("<form action='login2.html' method='post'>");
		pw.println("UserName: <input type='text' name='userName' value='default'><br><br>");
		pw.println("Password: <input type='password' name='pass'><br><br>");
        pw.println("<input type='submit' value='Second page go'>");  
        pw.println("</form>");  
        pw.println("</body>");  
        pw.println("</html>");  
        
		pw.close();
	}

}
