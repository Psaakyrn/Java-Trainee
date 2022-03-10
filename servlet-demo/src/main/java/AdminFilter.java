import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class AdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String pass = request.getParameter("pw");
		String name = request.getParameter("name");
		if("admin".equals(name) && "MyPassword".equals(pass))
		{
			//filter.doFilter(request, response);
			pw.println("Welcome "+request.getParameter("name")+"<br>");
			RequestDispatcher rd=request.getRequestDispatcher("viewServlet");
			rd.include(request, response);
		}
		else
		{
			pw.println("Wrong Username/Password<br>");
			System.out.println("Wrong password");	
			RequestDispatcher rd=request.getRequestDispatcher("filter_ex.html");
			rd.include(request, response);
		}
	}

}
