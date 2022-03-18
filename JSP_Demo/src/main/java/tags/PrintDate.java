package tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;


public class PrintDate extends TagSupport{
public int doStartTag() throws JspException{
    JspWriter out=pageContext.getOut();
    try
    {
        out.print("Time is "+java.util.Calendar.getInstance().getTime());
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    return SKIP_BODY;
}
}
