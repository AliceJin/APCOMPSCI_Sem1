import java.util.Scanner;
public class Lucky7s
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		long number = kb.nextLong();
		
		System.out.println(luck(number));
	}
	
	public static int luck(long num)
	{
		if(num > 0)
		{
			if((num % 10) == 7)
			{
				return (1 + luck(num / 10));
			}
			else
			{
				return (0 + luck(num / 10));
			}
		}
		else
		{
			return 0;
		}
	}
}
