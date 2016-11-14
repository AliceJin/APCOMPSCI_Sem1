import java.util.Scanner;
public class FirstLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5]; //new array
		
		//set user input as array
		System.out.println("Please enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		//print first character
		System.out.println("\nFirst characters in each word: ");
		first(words);
	}
	
	public static void first(String[] w)
	{
		for(String word : w)
		{
			System.out.println(word.charAt(0));
		}
	}
}