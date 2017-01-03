import java.util.Scanner;
import java.util.Arrays;
public class GameHealth
{
	static String[] health;                   //string array
	static int HEALTHLOAD = 6;
	static int healthCount;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";                     //string var
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		System.out.println("Quit program with \"Q\"");
		while(!turn.equals("Q") && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.nextLine();
			damage = (int) (Math.random() * 2) + 1;     //1 to 2
			amount = (int) (Math.random() * 6) + 1;     //1 to 6
			System.out.println(takeDamage(damage, amount)); 
			printClip();
		}
		System.out.println("You died!!!");
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		String ret;
		if(dmg == 1)
		{
			healthCount -= amt;                          //Take damage
			ret = "Taking " + amt + " damage!";
		}
		else
		{
			if(healthCount + amt < HEALTHLOAD)
			{
				healthCount += amt;
			}
			else
			{
				healthCount = HEALTHLOAD;                //No bigger than HEALTHLOAD
			}
			ret = "Power up " + amt + " !";
		}
		return ret;
	}
	
	public static void printClip()
	{
		String output = "Health:\t";
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = " @ ";                       //full
			}
			else
			{
				health[i] = " [] ";                      //empty
			}
			output += health[i];
		}
		System.out.println(output);
	}
}