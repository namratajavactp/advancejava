<%@page import="beanex.AddressBean" %>
<jsp:useBean id="address" class="beanex.AddressBean" scope="request" />
<jsp:setProperty name="address" property="*" />
street:<%= address.getStreet() %>
city:<%=address.getCity() %>
zip:<%=address.getZip() %>
state:<%=address.getState() %>