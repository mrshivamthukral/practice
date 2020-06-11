package login;
import java.io.IOException;
import java.io.Writer;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name="mylogin",urlPatterns= {"/Login.jlc"})
public class LoginServlet extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		String unm=req.getParameter("username");
		String pwd=req.getParameter("password");
		String msg="";
		if(unm.contentEquals(pwd)) {
			msg="<h1>Login Success<br/>Welcome to JLC Home Page";
			}
		else {
			msg="<h1>Login Failed<br/>Invalid Username or Password";
		}
	Writer out=res.getWriter();
	out.write(msg);
	
	}
}