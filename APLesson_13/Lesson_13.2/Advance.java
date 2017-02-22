public class Advance extends Ticket
{
	private int daysLeft;
	//constructor
	public Advance(int d)
	{
		super();
		this.daysLeft = d;
	}
	
	public double getPrice()
	{
		if(this.daysLeft >= 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}