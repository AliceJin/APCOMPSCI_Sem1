public abstract class Ticket
{
	private int serialNo;
	//default constructor
	public Ticket()
	{
		serialNo = (int) (Math.random() * 10000000) + 1;
	}
	
	//accessors
	public int getSerialNo()
	{
		return serialNo;
	}
	
	//abstract
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + 
		       "\nPrice: $" + getPrice();
	}
}