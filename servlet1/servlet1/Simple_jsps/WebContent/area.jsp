<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<BODY>
   Using pi = <%=pi%>, the area of a circle<br>
   with a radius of 3 is <%=area(3)%>
<%!
  double area(double r)
  {
    return r*r*pi;
  }
 %>

 <%! final double pi=3.14159; %>
</BODY>
</HTML>
