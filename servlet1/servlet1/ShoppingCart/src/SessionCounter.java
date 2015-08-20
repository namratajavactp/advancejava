import javax.servlet.http.*;
import java.util.ArrayList;
public class SessionCounter implements HttpSessionListener, HttpSessionAttributeListener
{
private static int activeSessions = 0;
public void sessionCreated(HttpSessionEvent evt)
{
	System.out.println("Session created:"+evt.getSession().getId());
	activeSessions++;
	System.out.println("No. of active sessions on:"+new java.util.Date()+" : "+activeSessions);
}
public void sessionDestroyed (HttpSessionEvent evt)
{
	System.out.println("Session destroyed"+evt.getSession().getId());
	activeSessions--;
}

public void attributeAdded(HttpSessionBindingEvent event)
{  

	System.out.println("attribute added>"+event.getSession().getId()+", Attribute added="+event.getName()+", Attribute value:"+((ArrayList)event.getValue())+".");
}

public void attributeRemoved(HttpSessionBindingEvent event)
{
	System.out.println("attribute removed>"+event.getSession().getId()+", Attribute removed="+event.getName()+", Attribute value:"+((ArrayList)event.getValue())+".");	
}

public void attributeReplaced(HttpSessionBindingEvent event)
{
	System.out.println("attribute replaced>"+event.getSession().getId()+", Attribute added="+event.getName()+", Attribute value:"+event.getValue()+".");	
}



}