import java.util.Scanner;
public class Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to choose your own adventure game!");
		System.out.println("STORY: You are lost in the woods.");
		System.out.println("The winter wind ");
		System.out.println("The sky is darkening and you need to find shelter.");
		System.out.println("You catch a glimpse of light far away through the tangle of branches.");
		System.out.println("What do you do?" +
							"\n 1. Go toward the light." +
							"\n 2. Head away from the light.");
		int choice1 = kb.nextInt();
		kb.nextLine();
		if(choice1 == 1)
		{
			System.out.println("As you go towards the light, you see that the light is emanating from" +
			" a small, wooden log cabin. There is smoke coming out of the chimney.");
			System.out.println("Do you go in?" +
								"\n 1. Yes." +
								"\n 2. No.");
			int choice2 = kb.nextInt();
			kb.nextLine();
			if(choice2 == 1)
			{
				System.out.println("You catiously open the door to the cabin.");
				System.out.println("Inside, a friendly looking old lady is busy knitting.");
				System.out.println("On the stove, steam is coming out of a boiling kettle.");
				System.out.println("The old lady offers you shelter and some nice tea.");
				System.out.println("What do you do?" +
									"\n 1. Accept both offers." +
									"\n 2. You accept the shelter provided but refuse the tea.");
				int choice3 = kb.nextInt();
				kb.nextLine();
				if(choice3 == 1)
				{
					System.out.println("You sit down at a rounded table along with the old lady.");
					System.out.println("You slowly sip the hot tea. Your taste buds pick up hints of raspberries and spices.");
					System.out.println("You decide to sleep upon a welcoming pile of hay.");
					System.out.println("The next morning you wake up refreshed. You look upon a thin covering of ");
					System.out.println("You thank the old lady profusely and continue onto your journey.");
				}
				if(choice3 == 2)
				{
					System.out.println("Wary of your surroundings, you hesistantly settle down in an isolated corner of the cabin to sleep.");
					System.out.println("");
				}
				else
				{
					
				}
			}
			if(choice2 == 2)
			{
				
			}
			else
			{
				
			}
		}
		if(choice == 2)
		{
			
		}
		else
		{
			System.out.println("You stood in the same place for hours. The neighboring wolf pack" +
								"came over for a visit and unfortunately you died during the process.");
		}
	}
}