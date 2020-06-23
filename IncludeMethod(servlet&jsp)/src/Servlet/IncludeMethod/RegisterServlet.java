package Servlet.IncludeMethod;

import java.io.IOException;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name="reg",urlPatterns= {"/myreg"})
public class RegisterServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String fn=req.getParameter("fname");
		String em=req.getParameter("email");
		String ph=req.getParameter("phone");
		String un=req.getParameter("uname");
		String pw=req.getParameter("pword");
		
		String page="";
		RequestDispatcher rd=null;
		if(!un.trim().isEmpty() & un.equals(pw) & !pw.trim().isEmpty()) {
			req.setAttribute("UN", un);
			page="home.jsp";
		}
		else {
			String msg="Registration failed,Try Again";
			req.setAttribute("MSG", msg);
			page="register.jsp";
		}
		rd=req.getRequestDispatcher(page);
		rd.forward(req,res);
	}
	}