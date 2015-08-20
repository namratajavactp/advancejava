<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 1</title>
</head>
<body>

Hello this is first jsp page<br/>
<% request.setAttribute("no",4);   %>
<jsp:include page="page2.jsp" /><br/>

Back to page 1 after including page2 response
<br/>
<%=(Integer)request.getAttribute("newno") %>
</body>
</html>