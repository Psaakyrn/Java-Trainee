package tags;

import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;

public class MyCustomTag extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
	      JspWriter out = getJspContext().getOut();
	      out.println("This is my custom tag.");
	   }

}
