public class XBox extends Console
{
	//constructors
	public XBox()
	{
		super();
	}
	
	public XBox(String p)
	{
		super(p);
	}
	
	//override abstract
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	//override
	public String getPlatform()
	{
		return "XBox";
	}
}