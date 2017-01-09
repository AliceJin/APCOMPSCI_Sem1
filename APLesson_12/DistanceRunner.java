import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter x1: ");
		int x1 = kb.nextInt();
		System.out.println("Please enter y1: ");
		int y1 = kb.nextInt();
		System.out.println("Please enter x2: ");
		int x2 = kb.nextInt();
		System.out.println("Please enter y2: ");
		int y2 = kb.nextInt();
		
		Distance obj = new Distance(x1, y1, x2, y2);
		System.out.println("The distance between (" + x1 + "," + y1 + ") and (" +
		x2 + "," + y2 + ") is " + obj.getDist());
		
		System.out.println("\nPlease enter new coordinates.");
		System.out.println("Please enter x1: ");
		x1 = kb.nextInt();
		System.out.println("Please enter y1: ");
		y1 = kb.nextInt();
		System.out.println("Please enter x2: ");
		x2 = kb.nextInt();
		System.out.println("Please enter y2: ");
		y2 = kb.nextInt();
		
		obj.setValues(x1, y1, x2, y2);
		System.out.println("The distance between (" + x1 + "," + y1 + ") and (" +
		x2 + "," + y2 + ") is " + obj.getDist());
	}
}