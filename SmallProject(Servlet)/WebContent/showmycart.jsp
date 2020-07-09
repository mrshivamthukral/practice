
<!DOCTYPE html>
<%@page import="java.util.Map"%>
<%@page import="Servlet.project.Book"%>

<html>
<head>
</head>
<body>
<h1> Books @ JLC Bookstore</h1> 

<table>
<tr>
<td>bookid</td>
<td>bookname</td>
<td>author</td>
<td>price</td>
<td>pub</td>
<td>category</td>
</tr>
<%
Object obj=session.getAttribute("MyCartMap");
if(obj!=null){
	Map<Integer,Book> myCartMap=(Map<Integer,Book>)obj;
	for(Book book:myCartMap.values())
	{
%>
<tr>
<td> <%=book.getBookid() %> </td>
<td> <%=book.getBookname() %> </td>
<td> <%=book.getAuthor() %> </td>
<td> <%=book.getPrice()%> </td>
<td> <%=book.getPub() %> </td>
<td> <%=book.getCategory() %> </td> 
<td><form action="removeFromCart.jlc" method="post">
<input type="hidden" name="bookId" value="<%= book.getBookid()%>"/>
<input type="submit" value="Remove from Cart"/>
</form>
</td>
</tr>
<%
}
}
%>
</table>
<h2> Total Price : ${TotalPrice}</h2>
<br/>
<h1> <a href="showbooks.jsp">Continue shopping</a> | <a href="placeorder.jsp">place order</a></h1>
