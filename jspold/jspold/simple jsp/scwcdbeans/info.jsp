<%@ page import="com.bean.*,java.io.*" %>
<jsp:useBean id="address" class="com.bean.MyBean" scope="session">
	<jsp:setProperty name="address" property="*" />
</jsp:useBean>
<%= "name of custumer" %><jsp:getProperty name="address" property="name" />
<%= "address of custumer" %> <jsp:getProperty name="address" property="address" /> 
<%= "state :" %> <jsp:getProperty name="address" property="state" /> 

