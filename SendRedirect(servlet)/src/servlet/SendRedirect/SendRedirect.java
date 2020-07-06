package servlet.SendRedirect;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="SendRedirect",urlPatterns={"/SendRedirect"})
public class SendRedirect extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException ,ServletException{
		String page=req.getParameter("page");
		if(page==null || page.trim().length()==0){
			String msg="Please provide the URl";
			req.setAttribute("MSG", msg);
			RequestDispatcher rd= req.getRequestDispatcher("Index.jsp");
			rd.forward(req,res);
			return;
		}
		if(page.startsWith("www")) {
			page="http://"+page;
		}
		res.sendRedirect(page);
	}
	}


