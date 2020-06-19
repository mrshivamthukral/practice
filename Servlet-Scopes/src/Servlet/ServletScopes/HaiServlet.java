package Servlet.ServletScopes;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

@WebServlet(name="HaiServlet",urlPatterns = {"/hai"},
initParams = {
		@WebInitParam(name="email",value="hai@gmail.com")
})
public class HaiServlet extends HttpServlet {

	

	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		String fName=req.getParameter("fname");
		String phone=req.getParameter("phone");
		Writer out=res.getWriter();
		res.setContentType("text/html");
		out.write("<h1> This response is from HaiServlet");
		out.write("<hr/>");
		out.write("Response of Request Parameter");
		out.write("<br/>First Name: "+fName);
		out.write("<br/>Phone: "+phone);
		out.write("<hr/>Servlet config parameters");
		
		// this is the second way of calling servlet config object;
		ServletConfig cfg= getServletConfig();
		String email=cfg.getInitParameter("email");
		out.write("<br/>Email: "+email);
		out.write("<hr/>Servlet Context Paramerts");
		
		//this is a way to call servlet context object through servlet config reference variable.
		ServletContext ctx=cfg.getServletContext();
		String web=ctx.getInitParameter("website");
		out.write("<br/>");
		out.write("<br/>Website: "+web);
	}
}
