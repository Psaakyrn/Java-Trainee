

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RequestDispatcherDemo
 */
public class RequestDispatcherDemo extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n = request.getParameter("userName");
		String p = request.getParameter("pass");
		String r = request.getParameter("redirect");
		
		if("google".equals(r))
		{
			response.sendRedirect("http://www.google.com");
		}
		else if("bing".equals(r))
		{
			response.sendRedirect("http://www.bing.com");
		}else if("password".equals(p) || "employee".equals(r))//set proper check here
		{
			ServletContext context = getServletContext();
			context.setAttribute("company", r);

			RequestDispatcher  rd = request.getRequestDispatcher("/employee2.html");
			rd.forward(request, response);	
		}
		else if("cookie".equals(r))
		{
			RequestDispatcher  rd = request.getRequestDispatcher("/cookie_ex.html");
			rd.forward(request, response);	
		}
		else if("hidden".equals(r))
		{
			RequestDispatcher  rd = request.getRequestDispatcher("/hidden_form.html");
			rd.forward(request, response);	
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("/welcome.html");
			rd.forward(request, response);
		}
		//doGet(request, response);
	}

}
