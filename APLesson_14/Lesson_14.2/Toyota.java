public class Toyota extends Car
{
	public Toyota()
	{
		super();
	}
	
	public Toyota(String l)
	{
		String[] locs = l.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
	}
}