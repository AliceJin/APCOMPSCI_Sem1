import java.util.Scanner;
public class Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Hello! Welcome to choose your own adventure game!");
		System.out.println("STORY: You are lost in the woods.");
		System.out.println("The winter wind blows bitterly against your cheek.");
		System.out.println("The sky is darkening and you need to find shelter.");
		System.out.println("You catch a glimpse of light far away through the tangle of branches.\n");
		System.out.println("What do you do?" +
							"\n 1. Go toward the light." +
							"\n 2. Head away from the light.\n");
		int choice1 = kb.nextInt();
		kb.nextLine();
		if(choice1 == 1)
		{
			System.out.println("As you go towards the light, you see that the light is emanating from\n" +
			" a small, wooden log cabin. There is smoke coming out of the chimney.\n");
			System.out.println("Do you go in?" +
								"\n 1. Yes." +
								"\n 2. No.\n");
			int choice2 = kb.nextInt();
			kb.nextLine();
			if(choice2 == 1)
			{
				System.out.println("You catiously open the door to the cabin.");
				System.out.println("Inside, a friendly looking old lady is busy knitting.");
				System.out.println("On the stove, steam is coming out of a boiling kettle.");
				System.out.println("The old lady offers you shelter and some nice tea.\n");
				System.out.println("What do you do?" +
									"\n 1. Accept both offers." +
									"\n 2. You accept the shelter provided but refuse the tea.");
				int choice3 = kb.nextInt();
				kb.nextLine();
				if(choice3 == 1)
				{
					System.out.println("You sit down at a rounded table along with the old lady.");
					System.out.println("You slowly sip the hot tea.");
					System.out.println("Your taste buds pick up hints of raspberries and spices.");
					System.out.println("You decide to sleep upon a welcoming pile of hay.");
					System.out.println("The next morning you wake up refreshed. The ground outside is covered with snow.");
					System.out.println("You thank the old lady profusely and continue onto your journey.");
				}
				else if(choice3 == 2)
				{
					System.out.println("Wary of your surroundings, you hesistantly ");
					System.out.println("settle down in an isolated corner of the cabin to sleep.");
					System.out.println("Overnight, a blizzard starts. A thin layer of frost covers your body.");
					System.out.println("In the morning, weak and hungry, you continue your journey through the woods.");
				}
				else
				{
					System.out.println("You stand around confused.");
					System.out.println("Before the lady ask you what is wrong, you faint.");
					System.out.println("Despite the lady's best efforts, you unfortunately perish from fatigue.");
				}
			}
			else if(choice2 == 2)
			{
				System.out.println("Wary of other life forms, you turn away from the cabin.");
				System.out.println("You continue your way through the dark woods.");
				System.out.println("Once again, you spot a light in the distance.");
				System.out.println("Only this time, it has a bluish-white hue.\n");
				System.out.println("What do you do?" +
									"\n 1. Approach it." +
									"\n 2. Avoid it.\n");
				int choice3 = kb.nextInt();
				kb.nextLine();
				if(choice3 == 1)
				{
					System.out.println("You walk catiously walk toward the source of the light.");
					System.out.println("You see an unicorn, resting upon a nest of moss.");
					System.out.println("It nods with its head, as if beckoning you to join it.");
					System.out.println("Too tired to continue your journey, you settle down by the side of the unicorn.");
					System.out.println("For the first time in forever, you sleep soundly, without the plague of nightmares.");
				}
				else if(choice3 == 2)
				{
					System.out.println("Sighing to yourself, you walk away from the faraway glow.");
					System.out.println("You decide to sleep on top of a high up tree branch.");
					System.out.println("Overnight, a blizzard starts. A thick layer of snow covers your body.");
					System.out.println("Unfortunately, you die from hypothermia.");
					
				}
				else
				{
					System.out.println("You stand in the same spot, indecisive.");
					System.out.println("Suddenly, a wave of black washes over you.");
					System.out.println("Unfortunately, you perish from fatigue.");
				}
			}
			else
			{
				System.out.println("You lean against the trunk of a tree, indecisive.");
				System.out.println("Suddenly, a wave of black washes over you.");
				System.out.println("Unfortunately, you perish from fatigue.");
			}
		}
		else if(choice1 == 2)
		{
			System.out.println("Wary of trusting anything in the forest, you walk away from the light.");
			System.out.println("All of a sudden, a ring of glowing eyes pop up around you.");
			System.out.println("You are surrounded by wolves.\n");
			System.out.println("What do you do?" +
								"\n 1. Run and try to make it through the pack of wolves." +
								"\n 2. Attempt to climb a tree.\n");
			int choice2 = kb.nextInt();
			kb.nextLine();
			if(choice2 == 1)
			{
				System.out.println("You panickedly crush through the bushes.");
				System.out.println("You slide down a hill and see a mountain cave in front of you.");
				System.out.println("What do you do?\n" +
									"\n 1. Run into the cave." +
									"\n 2. Run up the path next to the cave.\n");
				int choice3 = kb.nextInt();
				kb.nextLine();
				if(choice3 == 1)
				{
					System.out.println("You sprint into the darkness.");
					System.out.println("The ground is slippery and you trip.");
					System.out.println("You fall into an underground stream.");
					System.out.println("Carried by the current, you are swept to a riverbank far away.");
					System.out.println("Dazed, you look upon the village in front of you.");
					System.out.println("As if by the hand of destiny, you had arrived at your final destination.");
				}
				else if(choice3 == 2)
				{
					System.out.println("You run up the path.");
					System.out.println("The wolves, having reached their ");
					System.out.println("daily exercise quota, decided to stop chasing you.");
					System.out.println("Fully energized by the adrenaline coursing through your bloodstream,");
					System.out.println("you continue on your journey.");
				}
				else
				{
					System.out.println("Uncertain of what to do, you hesitate.");
					System.out.println("The pack of wolves befall upon you and you die.");
				}
			}
			else if(choice2 == 2)
			{
				System.out.println("You attempt to climb a branch.");
				System.out.println("But luck is against you and the branch snaps under your weight.\n");
				System.out.println("What do you do now?" +
									"\n 1. Fight with the branch." +
									"\n 2. Throw the branch.\n");
				int choice3 = kb.nextInt();
				kb.nextLine();
				if(choice3 == 1)
				{
					System.out.println("With all of your might, you bring the branch down upon a wolf's head.");
					System.out.println("The branch snaps again.");
					System.out.println("Ironically, you should know by now that the branch is brittle.");
					System.out.println("After all, it had broken under your weight.");
					System.out.println("But on the bright side, the wolves have a very nice dinner.");
				}
				else if(choice3 == 2)
				{
					System.out.println("You chuck the branch.");
					System.out.println("Fourteen pairs of eyes follow the branch.");
					System.out.println("Strangely, as if playing a game of fetch, ");
					System.out.println("the pack of wolves chase after the branch.");
					System.out.println("Not waiting for them to bring the branch back, you run away.");
				}
				else
				{
					System.out.println("You give up.");
					System.out.println("You hold your branch like a teddy bear as the wolves maul you to death.");
				}
			}
			else
			{
				System.out.println("Uncertain of what to do, you hesitate.");
				System.out.println("The pack of wolves befall upon you and you die.");
			}
		}
		else
		{
			System.out.println("You stand in the same place for hours. The neighboring wolf pack \n" +
								"comes over for a visit and unfortunately you die during the process.");
		}
	}
}