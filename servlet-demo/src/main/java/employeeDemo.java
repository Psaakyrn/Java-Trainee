

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * Servlet implementation class employeeDemo
 */
public class employeeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

/*		ServletContext context = getServletContext();
		String n = (String)context.getAttribute("company");

		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Employee Data</title>");
		pw.println("<link rel=\"stylesheet\" href=\"empdemo.css\">");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("<table>");
		pw.println("<thead>");
		pw.println("<caption>Detailz: "+n+"</caption>");
		pw.println("<tr>");
		pw.println("<th>Regno</th><th>Name</th><th>Marks</th>");
		pw.println("</tr>");
		pw.println("</thead>");
		pw.println("<tr>");
		pw.println("<td>001</td><td>Jon</td><td>32</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>002</td><td>Jane</td><td>82</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>005</td><td>Timmy</td><td>328</td>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.println("</body></html>");
*/
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Employee Data</title>");
		pw.println("<link rel=\"stylesheet\" href=\"empdemo.css\">");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("Please access page from index.html");
		pw.println("</body></html>");

	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String n = request.getParameter("userName");
		ServletContext context = getServletContext();
		String com = (String)context.getAttribute("company");
		
		Cookie ck = new Cookie("uName",URLEncoder.encode( n, "UTF-8" ));
		response.addCookie(ck);

		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Employee Data</title>");
		pw.println("<link rel=\"stylesheet\" href=\"empdemo.css\">");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("Welcome: "+n);
		if("employee".equals(com))
		{
			employeeData[] empData = (employeeData[])context.getAttribute("emp");
			
			pw.println("<table>");
			pw.println("<thead>");
			pw.println("<caption>Emp Detail: </caption>");
			pw.println("<tr>");
			pw.println("<th>Regno</th><th>Name</th><th>Salary</th>");
			pw.println("</tr>");
			pw.println("</thead>");
			for(int i=0; i<empData.length;i++)
			{
				pw.println("<tr>");
				pw.println("<td>"+empData[i].empID+"</td><td>"+empData[i].name+"</td><td>"+empData[i].salary+"</td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
		}
		else
		{
			pw.println("<table>");
			pw.println("<thead>");
			pw.println("<caption>Detailz: "+com+"</caption>");
			pw.println("<tr>");
			pw.println("<th>Regno</th><th>Name</th><th>Marks</th>");
			pw.println("</tr>");
			pw.println("</thead>");
			pw.println("<tr>");
			pw.println("<td>001</td><td>Jon</td><td>32</td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>002</td><td>Jane</td><td>82</td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>005</td><td>Tim</td><td>328</td>");
			pw.println("</tr>");
			pw.println("</table>");		
			
		}		
		pw.println("<a href='index.html'>Return to index</a>");
	
		pw.println("</body></html>");

	
	}

}

/*
<table>
<thead>
<caption>Detailz</caption>
<tr>
<td>Regno</td>
<td>Name</td>
<td>Marks</td>
</tr>
</thead>

<tr>
<td>001</td>
<td>Jon</td>
<td>32</td>
</tr>

<tr>
<td>002</td>
<td>Jane</td>
<td>82</td>
</tr>

<tr>
<td>005</td>
<td>Tim</td>
<td>328</td>
</tr>

</table>
*/