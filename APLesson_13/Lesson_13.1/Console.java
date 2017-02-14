public abstract class Console extends GameSystem
{
	//constructors
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	//abstract method
	public abstract String getController();
	
	//toString
	public String toString()
	{
		return "Platform: " + super.getPlatform() + 
		       "Serial #: " + super.getSerialNo() +
			   "Controller: " + getController();
	}
}