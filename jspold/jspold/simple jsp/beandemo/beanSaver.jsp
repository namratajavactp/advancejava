<%@ page import="java.io.*" %>
<jsp:useBean id="addressBean" scope="session" class="beanex.AddressBean"  >
<jsp:setProperty name="addressBean" property="*" />
</jsp:useBean>
<%
String message="";
try
{
	String name = request.getParameter("name");
	session.setAttribute("name",name);

	String appRelativePath="/WEB-INF/classes/serData/"+name+".ser";

	String realPath=application.getRealPath(appRelativePath);
	out.print("Realpath of serialised file:"+realPath);

	FileOutputStream fos=new FileOutputStream(realPath);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(addressBean);
	oos.close();
	message="Succesfully saved the bean as "+realPath;
}
catch(Exception e)
{
	 message=e+"Error: could not save the bean";

}

out.print(message);
%>

