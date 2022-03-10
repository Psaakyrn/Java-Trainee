

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * Servlet implementation class hidden_form
 */
public class hidden_form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String n = request.getParameter("userName");
		
		pw.print("Welcome "+n);
		
		pw.print("<form action='hidden2.html'>");  
        pw.print("<input type='hidden' name='uName' value='"+n+"'>");  
        pw.print("<input type='submit' value='Second page go'>");  
        pw.print("</form>");  
        
        pw.print("<br><br><a href='hidden2.html?uName="+URLEncoder.encode( n, "UTF-8" )+"'>This link should work too</a>");
        
        pw.close();
		
	}

}
