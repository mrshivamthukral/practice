package Servlet.project;
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/*
* @Author : Srinivas Dande
* @company : CourseCube
* @see : www.coursecube.com
* */
@WebServlet(name="removeFromCart",urlPatterns = "/removeFromCart.jlc")
public class RemoveFromCartServlet extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
System.out.println("RemoveFromCartServlet-service()");
//1.Collect the bookId
String bookId=req.getParameter("bookId"); //101
Integer bid=new Integer(bookId.trim());
//2.get the Session/cart
HttpSession session=req.getSession(false);
if(session==null) {
//Say Sorry...Session Expried
}else {
Set<Integer> mycart=(Set<Integer>) session.getAttribute("MyCart");
mycart.remove(bid);
session.setAttribute("MyCart", mycart);
System.out.println(mycart);
}
//4.Forward to ShowMyCartServlet
RequestDispatcher rd=req.getRequestDispatcher("showMyCart.jlc");
rd.forward(req, res);
}
} 