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

public class Catalog extends HttpServlet
{
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	   HttpSession session = req.getSession();
	   int itemCount = 0;
	   ArrayList cart = (ArrayList)session.getAttribute("cart");
	   if(cart!=null)
		{
		   itemCount = cart.size();
		}

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>Simple Shopping Cart " + "Example</title></head>");
		out.println("<body><table border=\"0\" width=\"100%\"><tr>");
		out.println("<td valign=\"top\"><img " + "src=\"/ShoppingCart/images/logo.gif\"></td>");
		out.println("<td align=\"left\" valign=\"bottom\">");
		out.println("<h1>WROX Book Store</h1></td></tr></table><hr>");
		out.println("<p>You've "+itemCount+" items in your cart.</p>");
		out.print("<form action=\"");
		out.println(res.encodeURL("/ShoppingCart/cart"));
		out.println("\"method=\"post\">");
		out.println("<table cellspacing=\"5\" cellpadding=\"5\"><tr>");
		out.println("<td align=\"center\"><b>Add to Cart</b></td></tr><tr><td align=\"center\">");
		out.println("<input type=\"Checkbox\" name=\"item\""
		+ " value=\"Begining Java2-JDK 1.4 Version\"></td>");
		out.println("<td align=\"left\">Item 1: "+" Begining Java2-JDK 1.4 Version</td></tr><tr>");
		out.println("<td align=\"center\">");
		out.println("<input type=\"Checkbox\" name=\"item\""
		+ " value=\"Professional Java XML\"></td>");
		out.println("<td align=\"left\">Item 2: "+" Professional Java XML</td></tr><tr>");
		out.println("<td align=\"center\">");
		out.println("<input type=\"Checkbox\" name=\"item\""
		+ " value=\"Professional Java Server Programming\"></td>");
		out.println("<td align=\"left\">Item 3: "+" Professional Java Server Programming</td></tr><tr>");
		out.println("</table><hr>");
		out.println("<input type=\"Submit\" name=\"btn_submit\" " + "value=\"Add To Cart\">");
		out.println("</form></body></html>");
		out.close();
	}
}














	





