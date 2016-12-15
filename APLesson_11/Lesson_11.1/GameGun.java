import java.util.Scanner;
import java.util.Arrays;
public class GameGun
{
	static int bulletCount;                   //total num of bullets
	static int CLIPSIZE	= 16;                 //num of bullets in clip
	static int shotCount;                     //num of shot left in clip
	static String[] clip;                     //printable clip size                    
	public static void main(String[]args)
	{
		//declare values of initial variables
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		Scanner kb = new Scanner(System.in);
		
		//fill up clip
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String input = kb.nextLine();
			if(input.equals("R"))
			{
				reload();
			}
			else if(input.equals("S"))
			{
				System.out.println(shoot());
			}
			else
			{
				System.out.println("Input error!");
			}
			printClip();
		}
		System.out.println("Out of Bullets!!!");
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = " [] ";
		}
	}
	
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			return "Boom!!!";
		}
		else
		{
			return "Reload!!!";
		}
	}
	
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)       //only fill up until shotCount
		{
			clip[i] = " * ";
		}
	}
	
	public static void printClip()
	{
		String output = "";
		output += "\nBullets:	" + bulletCount + "\nClip:	";
		for(int i = 0; i < CLIPSIZE; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}