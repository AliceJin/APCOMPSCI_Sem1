import java.util.Scanner;                       //import scanner

public class Receipt
{
	public static void main(String[]args)
	{
		Receipt form = new Receipt();           //create new object
		
		Scanner kb = new Scanner(System.in);    //instantiates scanner
		
		//takes user input
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		//calculations
		double total_1 = price1 + price2 + price3;            //subtotal before tax
		double tax = 0.075 * total_1;                         //california tax rate
		double total_2 = total_1 + tax;                       //final total
		
		//call on method
		form.format(item1, price1, item2, price2, item3, price3, total_1, tax, total_2); 
	}
	
	//method for formatting receipt
	public void format
	(String item1, double price1, String item2, double price2, String item3, double price3,
	double total_1, double tax, double total_2)
	{
		System.out.println("\n<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n");
		
		System.out.printf("* %20s ........ %15.2f\n", item1, price1);
		System.out.printf("* %20s ........ %15.2f\n", item2, price2);
		System.out.printf("* %20s ........ %15.2f\n\n", item3, price3);
		
		System.out.printf("* %20s ........ %15.2f\n", "Subtotal:", total_1);
		System.out.printf("* %20s ........ %15.2f\n", "Tax:" , tax);
		System.out.printf("* %20s ........ %15.2f\n", "Total:", total_2);
		
		System.out.println("______________________________________________");
		System.out.println("        * Thank you for your support *");
	}
}