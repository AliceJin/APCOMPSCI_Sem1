import java.util.Scanner;
public class InvClass
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the item manufacturer: ");
		String m = kb.nextLine();
		System.out.println("Please enter the item name: ");
		String n = kb.nextLine();
		System.out.println("Will you enter category and price info? (y or n)");
		String choice = kb.nextLine();
		if(choice.equals("y"))
		{
			System.out.println("Please enter the category: ");
			String c = kb.nextLine();
			System.out.println("Please enter the price: ");
			double p = kb.nextDouble();
			Inventory item1 = new Inventory(m, n, c, p);
			System.out.println(item1);
		}
		else if(choice.equals("n"))
		{
			Inventory item1 = new Inventory(m, n);
			System.out.println(item1);
		}
		else
		{
			System.out.println("Error!");
		}
	}
}