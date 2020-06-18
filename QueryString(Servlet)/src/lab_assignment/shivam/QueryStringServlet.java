package lab_assignment.shivam;

import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="QueryStringServlet",urlPatterns = {"/Google","/Amazon","/Flipkart","/Youtube","/Facebook"})
public class QueryStringServlet extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String uri=req.getRequestURI();
		String page=null;
		
		if(uri.equals("/QueryString/Google")) {
			
		 page="https://www.google.com/";
		page=page+"?rcode=my101";
		res.sendRedirect(page);
			
		}
		
		
		else if(uri.equals("/QueryString/Flipkart")) {
			
		 page="https://www.flipkart.com/";
		page=page+"?rcode=my101";
		res.sendRedirect(page);
			
	}
		
		else if(uri.equals("/QueryString/Youtube")) {
		
	 page="https://www.youtube.com/";
	page=page+"?rcode=my101";
	res.sendRedirect(page);
		
	}
		
			}

}
