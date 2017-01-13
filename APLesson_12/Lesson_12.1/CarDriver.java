import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter paint color of car: ");
		String p = kb.nextLine();
		System.out.println("Please enter interior type of car: ");
		String i = kb.nextLine();
		System.out.println("Please enter engine type of car: ");
		String e = kb.nextLine();
		System.out.println("Please enter tires type of car: ");
		String t = kb.nextLine();
		
		Car obj = new Car(p, i, e, t);
		System.out.println("Your vehicle: ");
		System.out.println();
	}
}