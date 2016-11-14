import java.util.Scanner;
public class RevWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];     //new array
		
		//take user input into array
		System.out.println("Please enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		//print in order
		System.out.println("\nIn order...");
		for(String word : words)
		{
			System.out.println(word);
		}
		
		//print in reverse
		System.out.println("\nIn reverse...");
		reverse(words);
	}
	
	public static void reverse(String[] w)
	{
		for (int i = (w.length - 1); i >= 0; i--)
		{
			System.out.println(w[i]);
		}
	}
}