public class GameSystem
{
	private String platform;
	private int serialNo;
	
	//constructors
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = (int) (Math.random() * 7) + 1; 
	}
	
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int) (Math.random() * 7) + 1; 
	}
	
	//accessors
	public String getPlatorm()
	{
		return this.platform;
	}
	
	public int getSerialNo()
	{
		return this.serialNo;
	}
}