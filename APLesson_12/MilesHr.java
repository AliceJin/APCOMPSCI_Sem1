import java.lang.Math.*;
public class MilesHr
{
	private int distance, hours, minutes;
	private double mph;
	
	//default constructor
	public MilesHr()
	{
		distance = 0;
		hours = 0;
		minutes =0;
		mph = 0;
	}
	
	//constructor with params
	public MilesHr(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		mph = 0;
	}
	
	//modifier
	public void setValues(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		mph = 0;
	}
	
	//accessors 
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
}