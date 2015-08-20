<%@ page import="java.io.*,com.bean.*" %>
<%
	String str =(String) session.getAttribute("name");
	FileInputStream fis = new FileInputStream(str+".ser");
	ObjectInputStream oos = new ObjectInputStream(fis);
	MyBean mb = (MyBean) oos.readObject();
%>
<html>
	<body>
		<%= str %>
		Name : <%= mb.getName() %>
		Address : <%= mb.getAddress() %>
		state : <%= mb.getState() %>
	</body>
</html>