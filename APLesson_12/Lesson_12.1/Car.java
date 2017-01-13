public class Car
{
	//paint, interior, engine, tires
	private String p, i, e, t; 
	
	//default constructor
	public Car()
	{
		p = "";
		i = "";
		e = "";
		t = "";
	}
	
	//constructor with params
	public Car(String paint, String interior, String engine, String tires)
	{
		p = paint;
		i = interior;
		e = engine;
		t = tires;
	}
	
	//modifier
	public void setCustom(String paint, String interior, String engine, String tires)
	{
		p = paint;
		i = interior;
		e = engine;
		t = tires;
	}
	
	//Accessors
	public String getPaint()
	{
		return p;
	}
	
	public String getInterior()
	{
		return i;
	}
	
	public String getEngine()
	{
		return e;
	}
	
	public String getTires()
	{
		return t;
	}
}