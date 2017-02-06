public abstract class Toy
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
	
	//modifiers
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(int c)
	{
		this.count = c;
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
	
	//abstract method - overridden with AFigure and Car
	public abstract String getType();
	
	//toString
	public String toString()
	{
		return this.name + " " + this.count;
	}
}