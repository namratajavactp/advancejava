<%@ page import="java.io.*,com.bean.*" %>
<% MyBean address = (MyBean)session.getAttribute("address");
	if(address == null)
	{
		ClassLoader classLoader = this.getClass().getClassLoader();
		address = (MyBean)java.beans.Beans.instantiate(classLoader,"com.bean.MyBean");
	}
		address.setName(request.getParameter("name"));
		address.setAddress(request.getParameter("address"));
		address.setState(request.getParameter("state"));

		session.setAttribute("address",address);
	
	MyBean address1 = (MyBean) session.getAttribute("address");
%>
<html>
<body bgcolor='cyan'>
	<%= address1.greet() %><br>
	Name    :    <%= address1.getName() %><br>
	Address :    <%= address1.getAddress() %><br>
	State   :    <%= address1.getState() %><br>
	<a href="serialize.jsp">click here to serialize bean</a><br>
</body>
</html>
