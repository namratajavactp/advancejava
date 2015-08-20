

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 * Servlet implementation class for Servlet: GreetServlet
 *
 */
 public class GreetServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
   
      String drivername;
      String driverurl;
      String username,password;
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public GreetServlet() {
		super();
	}   	
	
	public void init()
	{
		
		ServletConfig sc= getServletConfig();
		  drivername= sc.getInitParameter("driver");
		  driverurl=sc.getInitParameter("url");
		  username=sc.getInitParameter("username");
		  password=sc.getInitParameter("password");
		    
		System.out.println("init meth called");
	}
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				   
	}  	
	
	/* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean flag=false;
		System.out.println("service->dopost called");
		PrintWriter pw = response.getWriter();
		   String value = request.getParameter("username");
		   try
		   {
		    Class.forName(drivername);
		    Connection con=DriverManager.getConnection(driverurl,username,password);
		  
		    
		    String s="select sal from temp_servlet where name=?";
		    PreparedStatement p=con.prepareStatement(s);
		    p.setString(1, value);
		    ResultSet rs=p.executeQuery();
		    
		    pw.println("<html><body>"); 
		    while(rs.next())
		    {
		       flag=true;
		    	int n=rs.getInt(1);
		    	   
	 pw.println("<h2><b>Hello "+ value +" your salary is"+ n+ "</b></h2>");
		    	
		    }
		    
		    if(flag==false)
		    {
		    	RequestDispatcher rd=request.getRequestDispatcher("error.html");
		    	rd.forward(request, response);
		    	
		    /*	
		    	ServletContext sc=getServletContext();
		    	RequestDispatcher rd=sc.getRequestDispatcher("/error.html");
		    	rd.forward(request, response);
		    	*/
		    	
		    	
		    }
		   
		   pw.println("</body></html>");
		   pw.close();
		   con.close();
		   }
		   catch(Exception e){e.printStackTrace();}
	}   	  	    
	
	public void destroy()
	{
	   System.out.println("destroy meth called");	
	}
}