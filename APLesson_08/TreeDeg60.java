import java.util.Scanner;
public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//user input
		System.out.println("Please enter your word: ");
		String word = kb.next();
		kb.nextLine();
		
		//call function
		tree(word, 0, word.length());
	}
	
	public static void tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.println(word.substring(0, start));
			start++;
			tree(word, start, stop);
		}
	}
}