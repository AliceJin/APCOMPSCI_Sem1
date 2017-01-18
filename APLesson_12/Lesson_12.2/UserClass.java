import java.util.Scanner;
public class UserClass
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fN = kb.nextLine();
		System.out.println("Please enter your last name: ");
		String lN = kb.nextLine();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String choice = kb.nextLine();
		if(choice.equals("n"))
		{
			User obj = new User(fN, lN);
		}
		else if(choice.equals("y"))
		{
			System.out.println("Please enter your avatar name: ");
			String av = kb.nextLine();
			User obj = new User(fN, lN, av);
		}
		else
		{
			System.out.println("Error!");
		}
		
		//add toString
	}
}