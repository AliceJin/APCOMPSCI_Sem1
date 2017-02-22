public class PlayStation extends Console
{
	//constructors
	public PlayStation()
	{
		super();
	}
	
	public PlayStation(String p)
	{
		super(p);
	}
	
	//overrides abstract
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	//override
	/*
	public String getPlatform()
	{
		return "PlayStation";
	}
	*/
	
	public String getPlatform() //how to override ???
	{
		super.platform = "PlayStation";
		return super.getPlatform();
	}
}