package sampleLib;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
public class IfTag implements Tag
{
	private boolean condition=false;
	private PageContext pageContext;
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
	public void setCondition(boolean condition)
	{
		this.condition=condition;
	}
	public int doStartTag() throws JspException
	{
		if(condition)
		{
			return EVAL_BODY_INCLUDE;
		}
		else
		{
			return SKIP_BODY;
		}
	}
	public int doEndTag() throws JspException
	{
	  return EVAL_PAGE;
	}
	public void release()
	{
	}

}
