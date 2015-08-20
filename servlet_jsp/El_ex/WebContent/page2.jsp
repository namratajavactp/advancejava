<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Inside page2 -included page</b><br/>


In paramTest2:
First name is <%= request.getParameter("firstname") %>
</br>
printing firstname using el:
${param.firstname}

<br/>

Looping through all the first names
<%
    String first[]=request.getParameterValues("firstname");
	for(int i=0;i<first.length;i++)
	{
		out.println(first[i]);
	}
%>
<br/>
printing using el:both firstnames
${paramValues.firstname[0]}
${paramValues.firstname[1]}

</body>
</html>