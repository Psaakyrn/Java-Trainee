

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class AdminServlet
 */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Admin Servlet here");
		
		/*
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

		List<Emp> el =EmpDao.getAllEmployees();
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Employee page</title>");
		pw.println("<link rel=\"stylesheet\" href=\"empdemo.css\">");
		pw.println("<head>");
		pw.println("<body>");
		
		if(el.size()>0)//make sure it actually has entries
		{
			pw.println("<table>");
			pw.println("<thead>");
			pw.println("<caption>Emp Detail: </caption>");
			pw.println("<tr>");
			pw.println("<th>ID</th><th>Name</th><th>DoB</th><th>Department</th><th>Salary</th>");
			pw.println("</tr>");
			pw.println("</thead>");
			for(Emp e: el)
			{
				pw.println("<tr>");
				pw.println("<td>"+e.getID()+"</td>");
				pw.println("<td>"+e.getName()+"</td>");
				pw.println("<td>"+e.getDoB()+"</td>");
				pw.println("<td>"+e.getDept()+"</td>");
				pw.println("<td>"+e.getSalary()+"</td>");
				pw.println("<td><a href='editServlet2?editThis="+e.getID()+"'>edit</a></td>");
				pw.println("<td><a href='deleteServlet?editThis="+e.getID()+"'>delete</a></td>");
				pw.println("</tr>");
			}
			pw.print("<tr>");
			pw.print("<form action='saveServlet' method='post'>");
			pw.print("<td><input type='number' name='emp_id'></td>");
			pw.print("<td><input type='text' name='name'></td>");
			pw.print("<td><input type='date' name='dob'></td>");
			pw.print("<td><input type='text' name='dept'></td>");
			pw.print("<td><input type='number' name='salary'></td>");
			pw.print("<td><input type='submit' name='button' value='save'></td>");
			pw.print("</form>");
			pw.print("</tr>");
			pw.println("</table>");
		}
		//pw.println("<br><a href='crud.html'>Return to main page</a>");
		pw.println("</body</html>");
		*/
	}

}
