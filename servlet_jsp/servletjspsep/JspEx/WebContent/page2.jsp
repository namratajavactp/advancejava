<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page2</title>
</head>
<body>
wr are in page 2 jsp
<% int a=(Integer)request.getAttribute("no"); %>
<%=++a %>

<% request.setAttribute("newno",a); %>
</body>
</html>