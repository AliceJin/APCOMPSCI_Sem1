import java.util.Scanner;
public class PasswordCheck
{
	static String username;
	static String password;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		//set username and password
		System.out.println("What is your username?");
		username = kb.nextLine();
		System.out.println("What is your password?");
		password = kb.nextLine();
		
		//run method
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Please enter your username: ");
		String name_check = kb.nextLine();
		System.out.println("Please enter your password: ");
		String word_check = kb.nextLine();
		
		if (name_check.equals(username) && word_check.equals(password))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(name_check.equals(username))
			{
				System.out.println("Your password is incorrect!");
			}
			else if (word_check.equals(password))
			{
				System.out.println("Your username is incorrect!");
			}
			else
			{
				System.out.println("Your username and password are incorrect!");
			}
			passCheck();
		}
	}
}