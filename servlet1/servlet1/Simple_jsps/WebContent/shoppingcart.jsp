<html>
	<body>
		<FORM METHOD=POST ACTION="shoppingcart.jsp">
			<SELECT NAME="topic">
				<option>C</option>
				<option>C++</option>
				<option>JAVA</option>
			</SELECT>
			<input type="Submit" name="chalo">
		</FORM>
		<HR></hr>
		<%@ page import="java.util.*" %>
		<% 
		  
		   session = request.getSession();
	/*	Date d=new Date(session.getCreationTime());
		d.getMinutes();
		Date d1=new Date();
		d1.getMinutes();
		if((d1-d)>10)
			session.invalidate();
		*/
		
		session.setMaxInactiveInterval(120);
		String str = request.getParameter("topic");
		if(str!=null)
		out.println(str);
		
		      if(session.getAttribute("cart")==null)
			   {
				
				ArrayList<String> arr=new ArrayList<String>();
				if(str!=null)
				arr.add(str);
				session.setAttribute("cart",arr);
			
			   }
		   	   else
			   {
		   		   ArrayList<String> arr1=(ArrayList)session.getAttribute("cart");
		   		   if(arr1!=null)
		   		   { 
		   		      for(String a:arr1)
		   		    	  out.println(a);
		   		        arr1.add(str);
		   		   } 
			   }
		   			   %>
		   			   
		   			   
		   			   
				
	</body>
</html>
		