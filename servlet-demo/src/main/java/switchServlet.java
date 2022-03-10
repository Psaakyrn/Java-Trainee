

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class switchServlet
 */
public class switchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		
		String b = request.getParameter("button");
		
		if("save".equals(b))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/saveServlet");
			rd.forward(request, response);
		}
		else if("edit".equals(b))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/editServlet");
			rd.forward(request, response);
		}else 
		{
			RequestDispatcher rd = request.getRequestDispatcher("/welcome.html");
			rd.forward(request, response);
		}
	}

}
