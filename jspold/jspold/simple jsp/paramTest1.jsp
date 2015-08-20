<html><body><pre>
<%@ page import="java.util.*" %>
In ParamTest1:
First Name is <%= request.getParameter("firstname") %>

<% application.setAttribute("Myname","namrata");
%>


<br>

${param.firstname}

${applicationScope.Myname}

<%
HashMap n=new HashMap();
n.put("name","namrata");
application.setAttribute("Mymap",n);
 %>
${applicationScope.Mymap.name}
<jsp:include page="paramTest2.jsp" flush="true">
  <jsp:param name="firstname" value="mary" />
</jsp:include>


<jsp:include page="page2.jsp" flush="true"/>
<jsp:forward page="page3.jsp"/>
 
</pre></body></html>

