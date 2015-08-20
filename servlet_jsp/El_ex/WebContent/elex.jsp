<%@ page import="java.util.*,abc.Person"%>





<%
HashMap n=new HashMap();
n.put("name1","namrata");
application.setAttribute("Mymap",n);

Person p=new Person();
p.setName("nisha");
request.setAttribute("person",p);

 %>
 
 <%=config.getInitParameter("region") %>
${Mymap.name1}
${applicationScope.Mymap.name1}
${pageContext.request.method }
<!-- 
${pageContext.servletConfig.initParameter.region }
-->