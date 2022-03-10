

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

/**
 * Servlet implementation class saveServlet
 */
public class saveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		//pw.println("id="+request.getParameter("emp_id"));
			
		int id = Integer.parseInt(request.getParameter("emp_id"));
		String name = request.getParameter("name");
		LocalDate dob = LocalDate.parse(request.getParameter("dob"));
		String dept = request.getParameter("dept");
		int salary = Integer.parseInt(request.getParameter("salary"));
		
		Emp e = new Emp(id,name,dob,dept,salary);
		
		if(EmpDao.save(e)!=0)
		{
			//pw.println("Successfully saved: "+id+" | "+name+" | "+dob+" | "+dept+" | "+salary);
			RequestDispatcher rd = request.getRequestDispatcher("/viewServlet");
			rd.forward(request, response);			
		}
		else
		{
			pw.println("Error on saving");
		}
		
		pw.println("<br><a href='viewServlet'>Return to main page</a>");
		
		
	}

}
