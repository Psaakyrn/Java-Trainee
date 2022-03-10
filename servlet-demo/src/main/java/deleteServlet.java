

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class deleteServlet
 */
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=-1;
		String n = request.getParameter("editThis");
		
		if(n!=null) {
			id=Integer.parseInt(n);
		}
		PrintWriter pw=response.getWriter();
		
		if(EmpDao.delete(id)!=0)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/viewServlet");
			rd.forward(request, response);
		}
		else
		{
			pw.println("Error on deleting");
		}
		
		pw.println("<br><a href='crud.html'>Return to main page</a>");

	}

}
