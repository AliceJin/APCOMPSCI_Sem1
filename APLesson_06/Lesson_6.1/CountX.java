import java.util.Scanner;
public class CountX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Count up to the integer: ");
		int upper = kb.nextInt();
		System.out.println("Count by the integer: ");
		int add = kb.nextInt();
		
		for(int i = add; i <= upper; i += add)
		{
			System.out.print(i + "	");
		}
		System.out.println("");
	}
}