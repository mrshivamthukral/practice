package Servlet.ForwardMethod;

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

@WebServlet(name="HelloServlet",urlPatterns = {"/hello"},
initParams = {
		@WebInitParam(name="email",value="hello@gmail.com")
})
public class HelloServlet extends HttpServlet {

	 ServletConfig cfg=null;

	//this is one way to call servlet config object 
	public void init(ServletConfig cfg) throws ServletException{
		this.cfg=cfg;
	}

	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		String fName=req.getParameter("fname");
		String phone=req.getParameter("phone");
		Writer out=res.getWriter();
		res.setContentType("text/html");
		out.write("<h1> This response is from HelloServlet");
		out.write("<hr/>");
		out.write("Response of Request Parameter");
		out.write("<br/>First Name: "+fName);
		out.write("<br/>Phone: "+phone);
		out.write("<hr/>Servlet config parameters");
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
