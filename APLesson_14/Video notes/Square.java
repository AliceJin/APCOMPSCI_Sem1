//subclass of a class that implements an interface will auto
//implement that interface as well
public class Square extends Rectangle
{
	private double side;
	public Square(double s)
	{
		super(s, s);
	}
	
	public double getSide()
	{
		return sideA;
	}
}