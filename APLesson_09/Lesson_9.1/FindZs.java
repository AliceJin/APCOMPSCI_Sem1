import java.util.Scanner;
public class FindZs
{
	static String[] words = new String[5];          //new String array
	static Scanner kb = new Scanner(System.in);     //instance scanner
	public static void main(String[]args)
	{
		//fill array with user input
		System.out.println("Please enter 5 words: ");
		fillArray();
		
		//print result
		System.out.println("\nFor the words: ");
		printArray();
		System.out.println("\nOnly " + hasZs() + "contain(s) the letter z.");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
			kb.nextLine();
		}
	}
	
	public static void printArray()
	{
		for(String word : words)
		{
			System.out.print(word + " ");
		}
	}
	
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += word + " ";
			}
		}
		return zs;
	}
}