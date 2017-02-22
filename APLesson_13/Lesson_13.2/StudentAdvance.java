public class StudentAdvance extends Advance
{
	//constructor
	public StudentAdvance(int d)
	{
		super(d);
	}
	
	public double getPrice()
	{
		return (super.getPrice() / 2);
	}
	
	public String toString()
	{
		return super.toString() + "\n(STUDENT ID REQUIRED)";
	}
}