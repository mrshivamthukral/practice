package Servlet.project;



import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="showMyCart",urlPatterns="/showMyCart.jlc")
public class ShowMyCartServlet extends HttpServlet{ 
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		System.out.println("ShowMyCartServlet-service()"); 

		HttpSession session=req.getSession(false);
		if(session==null) {
			
		}else {
			Set<Integer>mycart=(Set<Integer>)session.getAttribute("MyCart");
			Map<Integer,Book> bookMap=(Map<Integer,Book>) session.getAttribute("BookMap");
			
			Map<Integer,Book> cartMap=new HashMap<>(); 
			for(int bid:mycart)
			{
				cartMap.put(bid,bookMap.get(bid));
			}
			session.setAttribute("MyCartMap", cartMap); 
			
			double totalPrice=0.0;
			for(Book mybook:cartMap.values()) {
			double offerPrice=mybook.getPrice() - mybook.getPrice()*10/100;
			totalPrice=totalPrice+offerPrice;
			}
			session.setAttribute("TotalPrice",totalPrice);
			System.out.println(mycart); 

			RequestDispatcher rd=req.getRequestDispatcher("showmycart.jsp");
			rd.forward(req, res); 
		}
		
	}

}
