public class Toy
{
	private String name;
	private int count;             //how many of toy
	
	//constructors
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	public Toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	//accessors
	public String getName()
	{
		return this.name;
	}
	
	public int getCount()
	{
		return this.count;
	}
}