<%@page import="java.util.*"%>
<html>
 <head><title>Simple Shopping Cart Example </title></head>
 <h1>WROX Book Store</h1>
 <body>
 
 <%   int itemCount = 0; 
	   ArrayList cart = (ArrayList)session.getAttribute("cart");
	   if(cart!=null)
		{
		   itemCount = cart.size();
		}
%>

 
		You've <%=itemCount%> items in your cart.</p>
<%		
		out.print("<form action=\"");
		out.println(response.encodeURL("/cart.jsp"));
		out.println("\"method=\"post\">");
	%>

		
		Data : <input type="text" name="data"><br><br>

<%
	out.println("<input type=\"Submit\" name=\"btn_submit\" " + "value=\"Add To"+ " cart\">");
		out.println("</form></body></html>");
		out.close();
 %>
</body>
</html>
