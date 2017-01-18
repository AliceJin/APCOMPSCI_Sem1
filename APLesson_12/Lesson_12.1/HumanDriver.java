import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the hair color: ");
		String h = kb.nextLine();
		System.out.println("Please enter the eye color: ");
		String e = kb.nextLine();
		System.out.println("Please enter the skin color: ");
		String s = kb.nextLine();
		
		Human obj = new Human(h, e, s);
		System.out.println("\nHuman info");
		System.out.println("Hair: " + obj.getHair());
		System.out.println("Eyes: " + obj.getEyes());
		System.out.println("Skin: " + obj.getSkin());
		
		System.out.println("\nPlease enter the new hair color: ");
		h = kb.nextLine();
		System.out.println("Please enter the new eye color: ");
		e = kb.nextLine();
		System.out.println("Please enter the new skin color: ");
		s = kb.nextLine();
		
		obj.setHES(h, e, s);
		System.out.println("\nFriend's info");
		System.out.println("Hair: " + obj.getHair());
		System.out.println("Eyes: " + obj.getEyes());
		System.out.println("Skin: " + obj.getSkin());
	}
}