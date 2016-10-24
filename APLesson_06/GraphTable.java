import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num = kb.nextInt();
		System.out.println("Please enter the table size: ");
		int size = kb.nextInt();
		
		System.out.println("Table");
		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%d  %d\n", i, i*num);
		}
	}
}