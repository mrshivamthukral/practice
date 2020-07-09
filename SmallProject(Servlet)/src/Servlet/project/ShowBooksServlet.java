package Servlet.project;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="showBooks",urlPatterns="/showBooks.jlc")
public class ShowBooksServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		System.out.println("ShowBooksServlel-service()");
		String cat=req.getParameter("mycategory");
		if(cat.equals("java")) {
		Book Book1=new Book(101,"Master Java","Sri",500.0,"JLC","Java");
		Book Book2=new Book(102,"Master Hibernate","Sri",500.0,"JLC","Java");
		Book Book3=new Book(103,"Master Spring","Sri",500.0,"JLC","Java");
		Book Book4=new Book(104,"Master Angular","Sri",500.0,"JLC","Java");
		Book Book5=new Book(105,"Master Spring Boot","Sri",500.0,"JLC","Java");
		Book Book6=new Book(106,"Master Servlets","Sri",500.0,"JLC","Java");
		Book Book7=new Book(107,"Master JDBC","Sri",500.0,"JLC","Java");
		Book Book8=new Book(108,"Master MongoDB","Sri",500.0,"JLC","Java");
		Book Book9=new Book(109,"Master React JS","Sri",500.0,"JLC","Java");

		Map<Integer,Book> bookmap= new HashMap();
		bookmap.put(101,Book1);
		bookmap.put(102,Book2);
		bookmap.put(103,Book3);
		bookmap.put(104,Book4);
		bookmap.put(105,Book5);
		bookmap.put(106,Book6);
		bookmap.put(107,Book7);
		bookmap.put(108,Book8);
		bookmap.put(109,Book9);
		
		HttpSession session=req.getSession();
		session.setAttribute("BookMap", bookmap);
		}
		
		else if(cat.equals("Python")) {
			Book Book1=new Book(101,"Python Crash Course","Eric Matthes",500.0,"JLC","Python");
			Book Book2=new Book(102,"Head-First Python, 2nd edition","Paul Barry ",500.0,"O’Reilly","Python");
			Book Book3=new Book(103,"Think Python","Allen B. Downey",500.0,"JLC","Python");
			Book Book4=new Book(104,"Real Python Course, Part 1r","Real Python",500.0,"JLC","Python");
			Book Book5=new Book(105,"Python Web Frameworks","Carlos de la Guardia",500.0,"JLC","Python");
			Book Book6=new Book(106,"learn Bottle","Sri",500.0,"JLC","Python");
			
			Map<Integer,Book> bookmap= new HashMap();
			bookmap.put(101,Book1);
			bookmap.put(102,Book2);
			bookmap.put(103,Book3);
			bookmap.put(104,Book4);
			bookmap.put(105,Book5);
			bookmap.put(106,Book6);
			
			
			HttpSession session=req.getSession();
			session.setAttribute("BookMap", bookmap);
			}
		
		else {
			String msg="Sorry,no book found for this"+cat;
			req.setAttribute("MSG", msg);
		}
		RequestDispatcher rd=req.getRequestDispatcher("showbooks.jsp");
		rd.forward(req, res);
		
	}

}
