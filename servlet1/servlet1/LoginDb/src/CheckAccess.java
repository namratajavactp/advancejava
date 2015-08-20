

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;


/**
 * Servlet implementation class CheckAccess
 */
public class CheckAccess extends HttpServlet {
	
	Connection con;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAccess() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    public void init() throws ServletException
	{
       ServletConfig sc=getServletConfig();
	   Enumeration e=sc.getInitParameterNames();
	   String paramname=null;
	   String paramvalue=null;
	   String dburl=null;
	   String username=null;
	   String passwordval=null;

	   while(e.hasMoreElements())
		{
         paramname  =(String)e.nextElement();

		 if(paramname.equals("driverclassname"))
			{

			 try
				{
		         paramvalue  =sc.getInitParameter(paramname);
				 Class.forName(paramvalue);
				}
			catch(ClassNotFoundException cn)
			    {
                  cn.printStackTrace();
				}
                
			  System.out.println(paramvalue);
			}
		else if(paramname.equals("dburl"))
			{
		      dburl  =sc.getInitParameter(paramname);
		      System.out.println(dburl);
			}
		else if(paramname.equals("username"))
			{
		      username  =sc.getInitParameter(paramname);
		      System.out.println(username);
			 
			}
			else if(paramname.equals("password"))
			{
		      passwordval  =sc.getInitParameter(paramname);
			 
			}




		}


        try
		{
		con=DriverManager.getConnection(dburl,username,passwordval);
		if(con!=null)
			System.out.println("connection success");
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}


	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uname=null;
		String pass=null;
		String paramname=null;

		   Enumeration e=  request.getParameterNames();
			   while(e.hasMoreElements())
			{
			   paramname  =(String)e.nextElement();
				   if(paramname.equals("username"))
				   
			   	     uname=request.getParameter(paramname);
					else if(paramname.equals("pass"))
						pass=request.getParameter(paramname);
			}

		PrintWriter pw=null;
		Statement s=null;
		ResultSet res=null;
		boolean flag=false;

		try
		{
             s=con.createStatement();
			 res=s.executeQuery("select * from login");
			 flag=false;
			String uname1=null;
			String pass1=null;


			 pw =response.getWriter();

			pw.println("<html>");
			pw.println("<head>login</head>");
			pw.println("<body>");
			
		
			while(res.next())
			{

				 uname1=res.getString(1);
			   	pass1=res.getString(2);	
                pw.println(uname1+" "+pass1);
                System.out.println(uname1+""+pass1);
                pw.println(uname+" "+pass);
                System.out.println(uname+""+pass);
				if(uname1.equals(uname))
				{
					if(pass1.equals(pass))
					{
                       pw.println("login allowed");
					   flag=true;
					   break;
					}
				}
			}
		}
		catch(SQLException ee)
		{
			ee.printStackTrace();

		}

			if(flag==false)
     		{

				pw.println("username or password is invalid");
			}

			pw.println("</body>");
			pw.println("</html>");



	}

}
