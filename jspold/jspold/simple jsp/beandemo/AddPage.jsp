<jsp:useBean id="addressBean" scope="session" class="beanex.AddressBean"  >
<jsp:setProperty name="addressBean" property="*" />
</jsp:useBean>
street: <jsp:getProperty name="addressBean" property="street" /> 
city:<%=addressBean.getCity() %>
zip:<%=addressBean.getZip() %>
state:<%=addressBean.getState() %>
${sessionScope.addressBean.street}
