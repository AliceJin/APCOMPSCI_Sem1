import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	
	//check if string toys is in list
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i++)
		{
			String name = toys.get(i);        
			String type = toys.get(i + 1);
			Toy ty = getThatToy(name);
			if(ty == null)
			{
				if(type.equals("Car"))
				{
					Car c1 = new Car(name);
					toyList.add(c1);
				}
				else if(type.equals("AF"))
				{
					AFigure f1 = new AFigure(name);
					toyList.add(f1);
				}
				else
				{
					System.out.println("Error!");
				}
			}
			else
			{
				ty.setCount(ty.getCount() + 1);
			}
		}
	}
	
	//check toyList to see if toy is on list
	public Toy getThatToy(String nm)
	{
		for(Toy a : toyList)
		{
			if((a.getName()).equals(nm))
			{
				return a;
			}
		}
		return null;
	}
	
	//get name of toy the occurs most frequently
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy a : toyList)
		{
			if(max < a.getCount())
			{
				max = a.getCount();
				name = a.getName();
			}
		}
		return name;
	}
	
	//get type of toy that occurs most frequently
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy a : toyList)
		{
			if(a.getType().equals("Car"))
			{
				cars++;
			}
			if(a.getType().equals("AF"))
			{
				figures++;
			}
		}
		if(cars > figures)
			{
				return "Cars";
			}
			else if (figures > cars)
			{
				return "Action Figures";
			}
			else
			{
				return "Equal amounts of action figures and cars!";
			}
	}
	
	//toString
	public String toString()
	{
		return Arrays.toString((toyList.toArray()));
	}
}