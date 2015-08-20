<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Displaying Address Bean</title>
</head>
<body>

  <jsp:useBean id="ad" class="emp.Address" scope="request"/>
  street: <jsp:getProperty name="ad" property="street" /> <br/>
  city  : <jsp:getProperty name="ad" property="city" /> <br/>
  state :<jsp:getProperty name="ad" property="state" /> <br/>
  
  <br/>
  
  Address toString meth  :<%=((emp.Address)request.getAttribute("ad")) %>
  <br/>
  Address method getType : <%=((emp.Address)request.getAttribute("ad")).addType() %>

  Address method getCity : <%=((emp.Address)request.getAttribute("ad")).getCity() %>


</body>
</html>