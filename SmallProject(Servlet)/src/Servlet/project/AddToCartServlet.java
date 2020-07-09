package Servlet.project;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="addToCart",urlPatterns="/addToCart.jlc")
public class AddToCartServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		System.out.println("AddToCartServlet-service()");
		String bookid=req.getParameter("bookId");
		Integer bid= new Integer(bookid.trim());
		
		HttpSession session=req.getSession();
		Set<Integer> mycart=null;
		Object obj=session.getAttribute("MyCart");
		if(obj==null)
		{
			mycart=new HashSet<Integer>();
			mycart.add(bid);
			session.setAttribute("MyCart",mycart);
		}
		else
		{
			mycart=(Set<Integer>)obj;
			mycart.add(bid);
			session.setAttribute("MyCart",mycart);
		}
		System.out.println(mycart); 

		RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
		
	}

}
