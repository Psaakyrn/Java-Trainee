

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * Servlet implementation class servlet_3
 */
public class servlet_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String n = request.getParameter("uName");
		String q = request.getParameter("question");
		pw.println("Welcome "+n);
		HttpSession session = request.getSession();
		session.setAttribute("uname",n);
		session.setAttribute("qn",q);
		
		pw.println("<a href='servlet_4'>visit</a>");
		
		pw.close();
	}

}
