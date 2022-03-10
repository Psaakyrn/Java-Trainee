

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class viewServlet
 */
public class viewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		int empTotal=EmpDao.getEmployeeTotal();
		//int pageId=0;
		int pageId=1;
		int rowTotal=5;
		int pageTotal=(int) Math.ceil((double)empTotal / rowTotal);
		String n = request.getParameter("pageId");
		
		if(n!=null) {
			pageId=Integer.parseInt(n);
		}
		int rowStart = ((pageId-1)*rowTotal)+1;
		int rowEnd = rowStart+rowTotal-1;
		if(rowEnd>empTotal) {rowEnd=empTotal;}
		List<Emp> el ;
		if(pageId==0) {
			el =EmpDao.getAllEmployees();
			rowStart = 1;
			rowEnd = empTotal;
		}
		else
		{
			el=EmpDao.getAllEmployees(rowStart-1, rowTotal);
		}
		
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
			pw.println("<tr>");
			pw.println("<form action='saveServlet' method='post'>");
			pw.println("<td><input type='number' name='emp_id'></td>");
			pw.println("<td><input type='text' name='name'></td>");
			pw.println("<td><input type='date' name='dob'></td>");
			pw.println("<td><input type='text' name='dept'></td>");
			pw.println("<td><input type='number' name='salary'></td>");
			pw.println("<td><input type='submit' name='button' value='save'></td>");
			pw.println("</form>");
			pw.println("</tr>");
			pw.println("</table>");
		}
		pw.print("| <a href='viewServlet?pageId=0'>all</a> |");
		for(int i=1;i<=pageTotal;i++)
		{
			if(pageId==i)
			{
				pw.print(" "+i+" |");
			}
			else
			{
				pw.print(" <a href='viewServlet?pageId="+i+"'>"+i+"</a> |");
			}
		}
		pw.println(" Displaying "+rowStart+" - "+rowEnd+" out of "+empTotal);
		//pw.println("<br><a href='crud.html'>Return to main page</a>");
		pw.println("</body</html>");

		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		int empTotal=EmpDao.getEmployeeTotal();
		//int pageId=0;
		int pageId=1;
		int rowTotal=5;
		int pageTotal=(int) Math.ceil((double)empTotal / rowTotal);
		String n = request.getParameter("pageId");
		
		if(n!=null) {
			pageId=Integer.parseInt(n);
		}
		int rowStart = ((pageId-1)*rowTotal)+1;
		int rowEnd = rowStart+rowTotal-1;
		if(rowEnd>empTotal) {rowEnd=empTotal;}
		List<Emp> el ;
		if(pageId==0) {
			el =EmpDao.getAllEmployees();
			rowStart = 1;
			rowEnd = empTotal;
		}
		else
		{
			el=EmpDao.getAllEmployees(rowStart-1, rowTotal);
		}
		
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
			pw.println("<tr>");
			pw.println("<form action='saveServlet' method='post'>");
			pw.println("<td><input type='number' name='emp_id'></td>");
			pw.println("<td><input type='text' name='name'></td>");
			pw.println("<td><input type='date' name='dob'></td>");
			pw.println("<td><input type='text' name='dept'></td>");
			pw.println("<td><input type='number' name='salary'></td>");
			pw.println("<td><input type='submit' name='button' value='save'></td>");
			pw.println("</form>");
			pw.println("</tr>");
			pw.println("</table>");
		}
		pw.print("| <a href='viewServlet?pageId=0'>all</a> |");
		for(int i=1;i<=pageTotal;i++)
		{
			if(pageId==i)
			{
				pw.print(" "+i+" |");
			}
			else
			{
				pw.print(" <a href='viewServlet?pageId="+i+"'>"+i+"</a> |");
			}
		}
		pw.println(" Displaying "+rowStart+" - "+rowEnd+" out of "+empTotal);
		//pw.println("<br><a href='crud.html'>Return to main page</a>");
		pw.println("</body</html>");

		
	}

}
