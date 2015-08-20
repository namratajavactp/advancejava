<html><body><pre>
In ParamTest1:
First Name is <%= request.getParameter("firstname") %>
${param.firstname}  
Last name is <%= request.getParameter("lastname") %>
<jsp:include page="paramTest2.jsp" flush="true" >
  <jsp:param name="firstname" value="mary" />
</jsp:include>
</pre></body></html>


hi remaining

