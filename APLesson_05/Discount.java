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
		System.out.println("You will receive a 15% discount if total payment is $2000 or higher.");
		
		subtotal = p1 + p2 + p3 + p4;
		discount();
	}
	
	public static void discount()
	{
		if (subtotal >= 2000)
			discount = 0.15 * subtotal; 
		if (subtotal < 2000)
			discount = 0; 
	}
}