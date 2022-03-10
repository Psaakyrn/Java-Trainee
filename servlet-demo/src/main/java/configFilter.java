import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class configFilter implements Filter {
	FilterConfig config;
	@Override
	public void init(FilterConfig _config) throws ServletException{
		config = _config;
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String s = config.getInitParameter("construction");
		String s2 = config.getInitParameter("message");
		
		System.out.println("system message: "+s2);
		
		if("yes".equals(s)) {
			pw.print("Page under construction.");
		}
		else
		{
			pw.print("system message: "+s2+"<br>");
			chain.doFilter(request, response);
		}
	}

}
