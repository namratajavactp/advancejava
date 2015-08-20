package sampleLib;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class RequiredTag implements Tag
{ private PageContext pageContext;
  private Tag parentTag;

  public void setPageContext(PageContext p)
	{ pageContext=p;
	}

public void setParent(Tag pt)
	{ parentTag=pt;
	}

public Tag getParent()
	{ return parentTag;
	}

	public int doStartTag()throws JspException
	{ try
		{
		JspWriter jw=pageContext.getOut();
		jw.print("<Font color ='#ff0000'>*</Font>");
		}
		catch(Exception e)
		{
			 throw new JspException("Error in requiredTag");
        }

		return SKIP_BODY;

	}
	public int doEndTag() throws JspException
	{
	  return EVAL_PAGE;
	}
  public void release()
	{
    }

}	 

  
