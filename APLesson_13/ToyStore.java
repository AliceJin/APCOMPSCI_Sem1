import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		//idk how to do this 
	}
	
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i++)
		{
			
		}
	}
}