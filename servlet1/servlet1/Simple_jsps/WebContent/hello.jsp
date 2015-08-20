<html>
	<body>
		<FORM METHOD=POST ACTION="hello.jsp">
			<SELECT NAME="topic">
				<option>C</option>
				<option>C++</option>
				<option>JAVA</option>
			</SELECT>
			<input type="Submit" name="chalo">
		</FORM>
		<HR></hr>
		<%--<% session = request.getSession();
		   if(session != null)
		   {
			   if(!session.isNew())
			   {--%>
			<%		String str = request.getParameter("topic");
					out.println(str);
			%>
			   <%--}
		   }
		   else
		   {
			   out.println("hi");
		   }
		 --%>
	</body>
</html>
		