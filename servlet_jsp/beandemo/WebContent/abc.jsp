<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="beanex.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="addressBean" scope="session" class="beanex.AddressBean"  />
	<jsp:getProperty name="addressBean" property="street" /> 

  street: 
  
city:<%=addressBean.getCity() %>

zip:<%=addressBean.getZip() %>

state:<%=addressBean.getState() %>

${sessionScope.addressBean.street}
${sessionScope.addressBean.city}
  
</body>
</html>