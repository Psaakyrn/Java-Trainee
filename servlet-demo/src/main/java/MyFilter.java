import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("filter invoked before");
		System.out.println("filter invoked before");
		filter.doFilter(request, response);
		pw.println("filter invoked after");
		System.out.println("filter invoked after");	

	}

}
