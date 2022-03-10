

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class editServlet2
 */
public class editServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		int id=-1;
		String n = request.getParameter("editThis");
		
		if(n!=null) {
			id=Integer.parseInt(n);
		}
		//int id = Integer.parseInt(request.getParameter("editThis"));
		Emp e = EmpDao.getEmployeeById(id);
		
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Employee page</title>");
		pw.println("<link rel=\"stylesheet\" href=\"empdemo.css\">");
		pw.println("<head>");
		pw.println("<body>");
		
		if(e.getID()!=0)
		{
			pw.println("<h1>Add New Employee</h1>");
			pw.println("<form action='switchServlet' method='post'>");
			pw.println("<table>");
			pw.println("<tr>");
			pw.println("<td>Employee ID:</td><td>"+e.getID()+"</td>");
			pw.println("<input type='hidden' name='emp_id' value='"+e.getID()+"'>");
			pw.println("</tr><tr>");
			pw.println("<td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'></td>");
			pw.println("</tr><tr>");
			pw.println("<td>DoB:</td><td><input type='date' name='dob' value='"+e.getDoB()+"'></td>");
			pw.println("</tr><tr>");
			pw.println("<td>Department:</td><td><input type='text' name='dept' value='"+e.getDept()+"'></td>");
			pw.println("</tr><tr>");
			pw.println("<td>Salary:</td><td><input type='number' name='salary' value='"+e.getSalary()+"'></td>");
			pw.println("</tr>");
			pw.println("</table>");
			pw.println("<input type='submit' name='button' value='edit'>");
			pw.println("</form>");
		}


	}

}
