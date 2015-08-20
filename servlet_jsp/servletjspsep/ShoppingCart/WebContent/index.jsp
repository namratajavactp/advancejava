<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart Web Application</title>
</head>
<body>
<%@ page import="java.util.*"  %>

<% ArrayList a=(ArrayList)session.getAttribute("shopcart");
   if(a!=null)
   {
%>
<h3>There are <%=a.size() %> items in your cart.

<%
   }
   
%>
<form  method="post" action="cart">
<b>Please Enter your bookName:</b>
  <input type="text" name="bookname" />
  
  <input type="submit" value="Submit" />
  
</form>

</body>
</html>