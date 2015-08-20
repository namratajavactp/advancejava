<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<body>
<c:set var="x">
${9}
</c:set>


<c:if test="${x=='9'}">
${x}
</c:if>
<c:set var="numList" value="one,two,three,four,five,six" />




<c:forEach var="x" begin="0" end="30" step="3">
${x}
</c:forEach>

<c:set var="color1">
${"black"}
</c:set>

<c:choose>
  <c:when test="${color1=='white'}">
    Light!!
  </c:when>
  <c:when test="${color1=='black'}">
     Dark!!
  </c:when>
  <c:otherwise>
    Colors!
  </c:otherwise>
</c:choose>
 
</body>
</html>
