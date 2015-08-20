In paramTest2:
First name is <%= request.getParameter("firstname") %>
${param.firstname}

Last name is <%= request.getParameter("lastName") %>
${param.lastName}

Looping through all the first names
<%
    String first[]=request.getParameterValues("firstname");
	for(int i=0;i<first.length;i++)
	{
		out.println(first[i]);
	}
%>

${paramValues.firstname[0]}
${paramValues.firstname[1]}

