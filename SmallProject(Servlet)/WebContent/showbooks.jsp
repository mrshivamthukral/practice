
<!DOCTYPE html>
<%@page import="java.util.Map"%>
<%@page import="Servlet.project.Book"%>

<html>
<head>
</head>
<body>
<h1> Books @ JLC Bookstore</h1> 
<div align="right">
<form action="showMyCart.jlc" method="post">
<input type="submit" value="Show My Cart">
</form>
</div> 
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
Object obj=session.getAttribute("BookMap");
if(obj!=null){
	Map<Integer,Book> bookmap=(Map<Integer,Book>)obj;
	for(Book book:bookmap.values())
	{
%>
<tr>
<td> <%=book.getBookid() %> </td>
<td> <%=book.getBookname() %> </td>
<td> <%=book.getAuthor() %> </td>
<td> <%=book.getPrice()%> </td>
<td> <%=book.getPub() %> </td>
<td> <%=book.getCategory() %> </td> 
<td><form action="addToCart.jlc" method="post">
<input type="hidden" name="bookId" value=" <%= book.getBookid()%> "/>
<input type="submit" value="Add to Cart">
</form> 
</td>
</tr>
<%
}
} else{
%> 
<h1> ${MSG} </h1> 
<%} %>
</table>
<div align="right">
<form action="showMyCart.jlc" method="post">
<input type="submit" value="Show My Cart">
</form>
</div> 
</body>
</html>