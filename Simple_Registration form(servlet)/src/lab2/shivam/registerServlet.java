package lab2.shivam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
public class registerServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String fn=req.getParameter("fname");
		String em=req.getParameter("email");
		String ph=req.getParameter("phone");
		String ge=req.getParameter("gender");
		String ti=req.getParameter("timing");
		String co=req.getParameter("course");
		String[]cous=req.getParameterValues("course");
		String re=req.getParameter("remark");
		String msg="your data has been stored";
		String ip=req.getRemoteAddr();
		res.setContentType("text/htm");
		
		PrintWriter out=res.getWriter();
		out.println("<h1>MyTrail Store</h1>");
		out.println("<h1>"+msg+"</h1>");
		out.println("<h1>first name:"+fn);
		out.println("<h1>email id:"+em);
		out.println("<h1>phone:"+ph);
		out.println("<h1>gender:"+ge);
		out.println("<h1>timing:"+ti);
		out.println("<h1>Ipadd:"+ip);
		out.println("<h1>course:"+co);
		out.println("<h1>All course:");
		if(cous!=null) {
			for(String c:cous)
				out.println("<br/>"+c);
		}
		out.println("<h1>remark:"+re);
		
	}
	}


