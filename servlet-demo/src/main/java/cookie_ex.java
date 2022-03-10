import java.io.*;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookie_ex
 */
public class cookie_ex extends HttpServlet {
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

		String n = request.getParameter("userName");
		
		Cookie ck = new Cookie("uName",URLEncoder.encode( n, "UTF-8" ));
		response.addCookie(ck);
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Cookie Page</title>");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("Welcome "+n+". Saving to cookie");
		pw.println("<form action='cookie2.html' method='post'>");
		pw.println("<input type='submit' value='go to cookie read page'>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
		
		//doGet(request, response);
	}

}
