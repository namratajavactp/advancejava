//import servlet packages
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Import java packages
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class ShoppingCart extends HttpServlet
{
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	   HttpSession session = request.getSession();

	   
	   ArrayList cart = (ArrayList)session.getAttribute("cart");
	   if(cart==null)
		{
		   cart = new ArrayList();
		   session.setAttribute("cart",cart);
		}

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

		String[] itemsSelected;
		String itemName;

		itemsSelected = request.getParameterValues("item");

		if(itemsSelected!=null)
		{
			for(int i=0;i<itemsSelected.length;i++)
			{
				itemName = itemsSelected[i];
				cart.add(itemName);
			}
		}
		//Print current contents of the cart
		out.println("<html><head><title>");
		out.println("Shopping Cart Contents");
		out.println("</title>,</head>");
		out.println("<body>");
		out.println("<h1>Items currently in your cart</h1>");
		out.println("<hr>");

		Iterator iterator =cart.iterator();
		while(iterator.hasNext())
		{
			out.println("<p>"+iterator.next()+"</p>");
		}

		out.print("<hr><p><a href=\"");
		out.print(response.encodeURL("/ShoppingCart/Catalog"));
		out.println("\">Back to the Shop</a></p>");

		out.close();
	}
}


		









