public class Honda extends Car
{
	private double[] location = new double[2];
	//private int ID;
	
	public Honda()
	{
		super();
		//location[0] = 0;
		//location[1] = 0;
		//ID = (int) (Math.random() * 1000000) + 1;
	}
	
	public Honda(double[] l)
	{
		//super(l[0], l[1]);
		location = l;
		//ID = (int) (Math.random() * 1000000) + 1;
	}
	
	/**
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	**/
}