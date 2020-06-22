package Servlet.ForwardMethod;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="LoginServlet",urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
	String unm=req.getParameter("Uname");
	String upw=req.getParameter("password");
	String page="Index.html";
	if(unm.equals(upw)) {
		page="/WEB-INF/home.html";
		RequestDispatcher rd=req.getRequestDispatcher(page);
		rd.forward(req, res);
	}else {
		page="/WEB-INF/error.html";
		RequestDispatcher rd=req.getRequestDispatcher(page);
		rd.forward(req, res);
	}
		
}
}
