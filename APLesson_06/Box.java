import java.util.Scanner;
public class Box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the string: ");
		String box = kb.nextLine();
		for(int i = 0; i < box.length(); i++)
		{
			System.out.println(box);
		}
	}
}