In paramTest2:
First name is <%= request.getParameter("firstname") %>
Last name is <%= request.getParameter("lastName") %>

Looping through all the first names
<%
    String first[]=request.getParameterValues("firstname");
	for(int i=0;i<first.length;i++)
	{
		out.println(first[i]);
	}
%>

