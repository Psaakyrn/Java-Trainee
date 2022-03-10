import java.io.*;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Servlet implementation class demo2
 */

class employeeData{
	String name;
	int empID;
	int salary;
	employeeData(String _name, int _empID, int _salary){
		name = _name;
		empID = _empID;
		salary = _salary;
	}
	
}

public class demo2 extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name="default";

		Cookie ck[]=request.getCookies();  
		if(ck!=null) {
			for(int i=0;i<ck.length;i++) {
				if(ck[i].getName().equals("uName"))
				{
					name = URLDecoder.decode(ck[i].getValue(), "UTF-8");
					break;
				}
			}
			
		}
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Index Page</title>");
		pw.println("<head>");
		pw.println("<body>");
		if(!name.equals("default")) {
			
			pw.println("<h1>Hello "+name+"</h1>");
		}
		pw.println("<a href=\"./employee\">Employee Link 2</a><br>");
		pw.println("<form action=\"login\" method=\"post\">");
		pw.println("UserName: <input type=\"text\" name=\"userName\"/ value=\""+name+"\"><br><br>");
		pw.println("Password: <input type=\"password\" name=\"pass\"/><br><br>");
	
		pw.println("<input type=\"radio\" name=\"redirect\" value=\"google\">"
				+ "<label>Google</label><br>");
		pw.println("<input type=\"radio\" name=\"redirect\" value=\"bing\">"
				+ "<label>Bing</label><br>");
		pw.println("<input type=\"radio\" name=\"redirect\" value=\"McD\">"
				+ "<label>McD</label><br>");
		pw.println("<input type=\"radio\" name=\"redirect\" value=\"KFC\">"
				+ "<label>KFC</label><br>");
		pw.println("<input type=\"radio\" name=\"redirect\" value=\"employee\">"
				+ "<label>employee</label><br>");
		pw.println("<input type=\"radio\" name=\"redirect\" value=\"cookie\">"
				+ "<label>cookie</label><br>");
		pw.println("<input type=\"radio\" name=\"redirect\" value=\"hidden\">"
				+ "<label>hidden</label><br>");
	
		pw.println("<input type=\"submit\" value=\"login\">");
		pw.println("</form>");
		
		employeeData[] empData = new employeeData[3];
		empData[0] = new employeeData("Amy",1001,2000);
		empData[1] = new employeeData("Betty",1002,3000);
		empData[2] = new employeeData("Carla",1003,1000);
		
		ServletContext context = getServletContext();
		context.setAttribute("emp", empData);
		
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
		pw.print("<br><br><a href='hidden2.html?uName="+URLEncoder.encode( name, "UTF-8" )+"'>This sneaky link for "+name+" should work too</a>");
		pw.println("</body>");
		pw.println("</html>");
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
