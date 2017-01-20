public class Inventory
{
	private String manufacturer, name, category;
	private int upc;
	private double price;
	
	//default constructor
	public Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		upc = 0;
		price = 0;
	}
	
	//constructors with params
	public Inventory(String m, String n)
	{
		manufacturer = m;
		name = n;
		category = "Undefined";
		upc = (int) (Math.random() * 1000000000) + 1;
		price = 0;
	}
	
	public Inventory(String m, String n, String c, double p)
	{
		manufacturer = m;
		name = n;
		category = c;
		upc = (int) (Math.random() * 1000000000) + 1;
		price = p;
	}
	
	//toString
	public String toString()
	{
		return "\nItem 1 info\nManufacturer: " + manufacturer + 
							"\nName: " + name +
							"\nCategory: " + category +
							"\nUPC#: " + upc +
							"\nPrice: " + price;
	}
}