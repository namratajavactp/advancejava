<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp Example</title>
</head>
<body>

<h3>Hello <%=request.getParameter("username")%> </h3>
<% application.setAttribute("name","nina"); %>
<jsp:forward page="hello1.jsp" />
</body>
</html>