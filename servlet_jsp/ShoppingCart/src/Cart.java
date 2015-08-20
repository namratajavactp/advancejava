import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;
public class Cart extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response )throws IOException
	{ Person p=new Person("nama");
	
		
		HttpSession session=request.getSession();
	
		  String book= request.getParameter("bookname");
		 ArrayList cart=(ArrayList)session.getAttribute("MyCart");
		 	
		  if(cart==null)//if its 1st req cart will not be set in session
		  {
			  cart=new ArrayList();  //so create a new cart 
			  cart.add(book);  //add book to cart
			  session.setAttribute("MyCart",cart); //set cart in session 
		  }
		  else
		  {
			  cart.add(book);
		//	  session.setAttribute("Mycart",cart);
		  }
		  
		  //display the shopping cart
		 PrintWriter pw= response.getWriter();
		  pw.println("Shopping cart contents:");
		  Iterator it=cart.iterator();
		  while(it.hasNext())
		  {
			  pw.println(it.next());
			  pw.println("<br/>");
		  }  
		//  pw.println(p.getName());
		  
		
		  pw.println("<hr><p><a href=\"");
		  pw.print(response.encodeURL("/ShoppingCart1/index.html"));
		  pw.println("\">Back to shop</a></p>");
		  
		  
	}
}
