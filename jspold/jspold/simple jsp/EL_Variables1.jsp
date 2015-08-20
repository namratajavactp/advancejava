<html><body>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<b>Expression Language variable </b>
<%! int x=16; %>
<c:set var="x" value="${4*4}" />
<p>The EL expression for x= ${x}.
<p>The script expression for x=<%= x %>.
<form action="EL_Variables1.jsp" method="GET">
  <p>What is x?<input type="text" size=2 name="num">
  <p><input type="submit">
</form>
<p><c:if test="${param.num== '16'}">
correct ans:${param.num}
</c:if>

</body></html>
