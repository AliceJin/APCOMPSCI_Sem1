import java.util.Scanner;       //import scanner
public class Discount
{
	static double p1;
	static double p2;
	static double p3;
	static double p4;
	
	static double subtotal;
	static double discount;
	static double tax;
	static double total; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);  //instantiates scanner
		
		//user input
		System.out.println("Enter the price of item 1: ");
		p1 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Enter the price of item 2: ");
		p2 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Enter the price of item 3: ");
		p3 = kb.nextDouble();
		kb.nextLine();
		System.out.println("Enter the price of item 4: ");
		p4 = kb.nextDouble();
		kb.nextLine();
		System.out.println("You will receive a 15% discount if total payment is $2000 or higher.\n");
		
		//subtotal and discount
		subtotal = p1 + p2 + p3 + p4;
		discount();
		
		//calculate tax
		tax = 0.065 * subtotal; 
		//calculate total
		total = subtotal - discount + tax; 
		
		//print
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>");
		format();
		System.out.println("_______________________________");
		System.out.println("          Thank You !          ");
	}
	
	public static void discount()
	{
		if (subtotal >= 2000)
			discount = 0.15 * subtotal; 
		if (subtotal < 2000)
			discount = 0; 
	}
	
	public static void format()
	{
		System.out.printf("Item 1:   %20.2f\n", p1);
		System.out.printf("Item 2:   %20.2f\n", p2);
		System.out.printf("Item 3:   %20.2f\n", p3);
		System.out.printf("Item 4:   %20.2f\n", p4);
		System.out.printf("Subtotal: %20.2f\n", subtotal);
		System.out.printf("Discount: %20.2f\n", discount);
		System.out.printf("Tax:      %20.2f\n", tax);
		System.out.printf("Total:    %20.2f\n", total);
	}
}