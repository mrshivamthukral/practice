package Servlet.IncludeMethod;


import java.io.IOException;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name="LoginServlet",urlPatterns={"/mylogin"})
public class LoginServlet extends HttpServlet{
	

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String un=req.getParameter("Uname");
		String pw=req.getParameter("password");
		
		String page="";
		RequestDispatcher rd=null;
		
		if(un.equals(pw) & !un.trim().isEmpty() & !pw.trim().isEmpty()) {
			req.setAttribute("UN", un);
			page="home.jsp";
		}
		else {
			String msg="invalid UserName or Password";
			req.setAttribute("Msg", msg);
			page="newlogin.jsp";
		}
				
			rd=req.getRequestDispatcher(page);
			rd.forward(req, res);
		
						
	}
	}

