

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

/**
 * Servlet implementation class for Servlet: ShoppingCart
 *
 */
 public class ShoppingCart extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public ShoppingCart() {
		super();
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
		
		String b=request.getParameter("bookname");
		HttpSession s=request.getSession();
		//add book to cart
		ArrayList a=(ArrayList)s.getAttribute("shopcart");
		if(a==null)
		{
		  
		   a=new ArrayList();
		   a.add(b);
		   s.setAttribute("shopcart",a);
		}
		else
		{
			a.add(b);
			
		}
		//display shopping cart contents
		PrintWriter pw=response.getWriter();
		pw.println("<b><h3>Shopping Cart Contents<b></h3><hr/>");
		
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			
			pw.println(it.next()+"<br/>");
		}
		
	
		
		pw.println("<a href='index.jsp'>add book </a>");
		pw.close();
		
	}   	  	    
}