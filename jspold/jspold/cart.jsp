<%@ page import="java.util.*"%>
<%
    ArrayList cart = (ArrayList)session.getAttribute("cart");

	 if(cart==null)
		{
		   cart = new ArrayList();
		   session.setAttribute("cart",cart);
		}

    String itemName = request.getParameter("data");
		if(itemName!=null)
		{
			cart.add(itemName);
		}
%>

<html><head><title>Shopping Cart Contents</title></head>
<body>
  <h1>Items currently in your cart</h1>
  <hr>

<%
   Iterator iterator =cart.iterator();
		while(iterator.hasNext())
		{
%>
<p><%=iterator.next()%></p>

<% } 
	    out.print("<hr><p><a href=\"");
		out.print(response.encodeURL("/login.jsp"));
		out.println("\">Back to the Shop</a></p>");

		out.close();


%>