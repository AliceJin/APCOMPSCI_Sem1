import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance: ");
		int d = kb.nextInt();
		System.out.println("Please enter the hours: ");
		int h = kb.nextInt();
		System.out.println("Please enter the minutes: ");
		int m = kb.nextInt();
		
		MilesHr obj = new MilesHr(d, h , m);
		System.out.println(d + " miles in " + h + 
		" hours and " + m + " minutes is " + obj.getMPH() + " mph."); 
		
		System.out.println("\nPlease enter a new distance: ");
		d = kb.nextInt();
		System.out.println("Please enter the new hours: ");
		h = kb.nextInt();
		System.out.println("Please enter the new minutes: ");
		m = kb.nextInt();
		
		obj.setValues(d, h, m);
		System.out.println(d + " miles in " + h + 
		" hours and " + m + " minutes is " + obj.getMPH() + " mph."); 
	}
}