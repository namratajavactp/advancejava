<%@ page import="java.io.*,com.bean.*" %>
<% 
	MyBean address = (MyBean)session.getAttribute("address");
	String name = address.getName();
	session.setAttribute("name",name);
	FileOutputStream fis= new FileOutputStream(name+".ser");
	ObjectOutputStream ois = new ObjectOutputStream(fis);
	ois.writeObject(address);
	ois.flush();
	ois.close();
%>
<html>
<body>
	
	Object Serialized
	
	<a href="deserialize.jsp"> deserialize object </a>

</body>
</html>
