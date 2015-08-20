package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class displaybean_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Displaying Address Bean</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  ");
      emp.Address ad = null;
      synchronized (request) {
        ad = (emp.Address) _jspx_page_context.getAttribute("ad", PageContext.REQUEST_SCOPE);
        if (ad == null){
          ad = new emp.Address();
          _jspx_page_context.setAttribute("ad", ad, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("  street: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((emp.Address)_jspx_page_context.findAttribute("ad")).getStreet())));
      out.write(" <br/>\r\n");
      out.write("  city  : ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((emp.Address)_jspx_page_context.findAttribute("ad")).getCity())));
      out.write(" <br/>\r\n");
      out.write("  state :");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((emp.Address)_jspx_page_context.findAttribute("ad")).getState())));
      out.write(" <br/>\r\n");
      out.write("  \r\n");
      out.write("  <br/>\r\n");
      out.write("  \r\n");
      out.write("  Address toString meth  :");
      out.print(((emp.Address)request.getAttribute("ad")) );
      out.write("\r\n");
      out.write("  <br/>\r\n");
      out.write("  Address method getType : ");
      out.print(((emp.Address)request.getAttribute("ad")).addType() );
      out.write("\r\n");
      out.write("\r\n");
      out.write("  Address method getCity : ");
      out.print(((emp.Address)request.getAttribute("ad")).getCity() );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
