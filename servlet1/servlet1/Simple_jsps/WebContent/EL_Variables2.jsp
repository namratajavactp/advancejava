<html><body>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<b>Expression Language variable </b>
<%! int x=6; %> 

<c:set var="x" value="${4*5}" />
<p>The EL expression for x= ${x}.
<p>The script expression for x=<%= x %>.
<form action="EL_Variables2.jsp" method="GET">
  <p>What is x?<input type="text" size=2 name="num">
  <p><input type="submit">
</form>
<p><c:choose>
      <c:when test="${param.num=='16'}">
	  Right!
	  </c:when>
	  <c:otherwise>
	  Wrong!
	  </c:otherwise>
	</c:choose>
</body></html>
