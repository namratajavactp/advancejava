<%@ taglib prefix="test" uri="sampleLib.tld" %>
<% boolean debug="true".equals(request.getParameter("debug")); %>
<html>
<body>
Hello<br>
<test:if condition="<%=debug%>">
DEBUG INFO
</test:if>
</body>
</html>