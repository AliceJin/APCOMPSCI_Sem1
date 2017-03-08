public class Rectangle
{
	double sideA, sideB;
	public Rectangle()
	{
		sideA = sideB = 0;
	}
	
	public Rectangle(double a, double b)
	{
		sideA = a;
		sideB = b;
	}
	
	public double getSideA()
	{
		return sideA;
	}
	
	public double getSideB()
	{
		return sideB;
	}
}