

<%@ page import="beanex.*" %>
<% 
   String str=(String)session.getAttribute("name"); 

   String str1 ="serData."+str;
      System.out.println(str1);
%>



<%= str1 %>
<jsp:useBean id="addressBean" type="AddressBean"  beanName="<%= str1 %>"  scope="session" />





street:<%=addressBean.getStreet() %>
city:<%=addressBean.getCity() %>
zip:<%=addressBean.getZip() %>
state:<%=addressBean.getState() %>
