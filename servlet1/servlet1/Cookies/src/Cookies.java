
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


public class Cookies extends HttpServlet
{ String name="namrata";
   int no=1;


	public void doPost(HttpServletRequest req,HttpServletResponse res) throws javax.servlet.ServletException, java.io.IOException
	{
       
		Cookie[] cookie= req.getCookies();
		if(cookie==null)
		{
			System.out.println("cookie array is null"); 
			String userid = req.getParameter("userid");
			String value = req.getParameter("data");
			System.out.println(userid+":"+value);

			Cookie c1=new Cookie("name",userid);
			Cookie c2=new Cookie(userid,value);
			res.addCookie(c1);
			res.addCookie(c2);
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<html><head><title>");
			out.println("Shopping Cart Contents");
			out.println("</title></head>");
			out.println("<body>");
			out.println("<h1>Items currently in your cart</h1>");
			out.println("<hr>");
			out.println(userid+"   "+value);
			out.print("<hr><p><a href='/Cookies/login1.html'>Back to the Shop</a></p>");

		}
		else
		{
			System.out.println("inside else part");
			String value = req.getParameter("data");
			System.out.println("data:"+value);

//			for(Cookie c:cookie)
//			{
//				if(c.getName().equals("name"))
//				{
//					System.out.println("name found:"+c.getName());
                  Cookie c2=new Cookie(("nama"+no++),value);
				  System.out.println(value);
				  res.addCookie(c2);
//				}
//			}
			
			
		


			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<html><head><title>");
			out.println("Shopping Cart Contents");
			out.println("</title></head>");
			out.println("<body>");
			out.println("<h1>Items currently in your cart</h1>");
			out.println("<hr>");
			out.println("most recently selected item:   "+value);
			out.println("<hr>");
		    
			for(Cookie c:cookie)
			{
				if(c.getName().equals("name"))
                {
					out.println("uuserid:"+c.getValue());
					System.out.println("uuserid:"+c.getValue());
				}
				else
				{
				  out.println(c.getValue());
				  System.out.println("item:"+c.getValue());
				}

			}
		
			out.print("<hr><p><a href='/Cookies/login1.html'>Back to the Shop</a></p>");
		

        }
	}


}