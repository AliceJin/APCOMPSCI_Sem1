import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//user input
		System.out.println("Please enter your starting number: ");
		int start = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int size = kb.nextInt();
		
		//new array
		int[] seq = new int[size];
		
		//calculate and print seq
		System.out.println("The Fibonacci sequence is: ");
		for(int i = 0; i < seq.length; i++)
		{
			if(i == 0 || i == 1)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = seq[i - 1] + seq[i - 2];
			}
			System.out.print(seq[i] + " ");
		}
	}
}