public class GMC extends Car
{
	private double xCor;
	private double yCor;
	private int ID;
	
	public GMC()
	{
		xCor = 0;
		yCor = 0;
		ID = (int) (Math.random() * 1000000) + 1;
	}
	
	public GMC(double x, double y)
	{
		xCor = x;
		yCor = y;
		ID = (int) (Math.random() * 1000000) + 1;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		xCor += x;
		yCor += y;
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = xCor;
		loc[1] = yCor;
		return loc;
	}
}