import java.util.Random;            //import Random class
public class DiceRoll
{
	static boolean error = false;          //true if tie
	
	public static void main(String[]args)
	{
		Random rand = new Random(); //instantiates method
		
		//random roll 1 to 6
		int player = rand.nextInt(6) + 1; 
		int comp = rand.nextInt(6) + 1; 
		
		//call function
		boolean outcome = rollDice(player, comp);
		
		//print statements
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + comp);
		
		if (!error)
		{
			if(outcome)
				System.out.println("The winner is you!");
			if(!outcome)
				System.out.println("The winner is the computer!");
		}
	}
	
	public static boolean rollDice(int player, int comp)
	{
		boolean win = true;         //set as true to initialize
		
		if (player > comp)
			win = true;
		if (comp > player)
			win = false;
		if (player == comp)
		{
			error = true;
			System.out.println("It's a tie! Please run the program again to determine the winner.");
		}
		return win; 
	}
}