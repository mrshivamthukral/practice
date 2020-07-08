package lab11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="TestServlet",urlPatterns = {"/test.jlc"})
public class TestServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		//1. Request parameters
		String un=req.getParameter("uname");
		String pw=req.getParameter("password");
		
		//2. Display Request Parameters.
		PrintWriter out=res.getWriter();
		out.println("<h1>UserName : "+un);
		out.println("<br/>UserName : "+pw);
		out.println("<hr/>");
		out.println("Request Headers");
		
		//3.Request Headers
		Enumeration ems=req.getHeaderNames();
		while(ems.hasMoreElements()) {
			String hn=ems.nextElement().toString();
			String hv=req.getHeader(hn);
			
			out.println("<br/>"+hn+" : "+hv);
		}
		out.println("<hr/>");
		out.println("Locale Info");
		
		//4. Locales supported by browser
		out.println("<br/> req.getLocale() :"+ req.getLocale());
		out.println("<hr/>");
		out.println("Other Info");
		
		//5. Other Informations from Request
		out.println("<br/> Method :"+req.getMethod());
		out.println("<br/> AuthType :"+req.getAuthType());
		out.println("<br/> requestUri :"+req.getRequestURI());
		out.println("<br/> protocol :"+req.getProtocol());
		out.println("<br/> ContentLength :"+req.getContentLength());
		out.println("<br/> ContentType :"+req.getContentType());
		out.println("<br/> Remote Addr :"+req.getRemoteAddr());
		out.println("<br/> Remote Port :"+req.getRemotePort());
		out.println("<br/> Remote Host :"+req.getRemoteHost());
		out.println("<br/> Server Port :"+req.getServerPort());
		out.println("<br/> Server Name :"+req.getServerName());
		out.println("<br/> QueryString :"+req.getQueryString());
		out.println("<br/> Servlet Path :"+req.getServletPath());
		out.println("<br/> Context path :"+req.getContextPath());
		
		
	}

}
