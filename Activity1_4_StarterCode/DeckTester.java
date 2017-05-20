/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] d1r = {"A", "B", "C"};
		String[] d1s = {"Giraffes", "Lions"};
		int[] d1v = {2, 1, 6};
		String[] d2r = {"1", "2", "3"};
		String[] d2s = {"Hearts", "Spades", "Clubs"};
		int[] d2v = {1, 2, 3};
		String[] d3r = {"J", "Q", "K"};
		String[] d3s = {"Hearts", "Spades", "Clubs", "Diamonds"};
		int[] d3v = {11, 12, 13};

		Deck d1 = new Deck(d1r, d1s, d1v);
		Deck d2 = new Deck(d2r, d2s, d2v);
		Deck d3 = new Deck(d3r, d3s, d3v);

		//printout for d1
		System.out.println("The size of Deck 1 is " + d1.size());
		for(int count = d1.size() - 1; count >= 0; count--)
		{
			System.out.println("Dealt card: " + d1.deal());
			System.out.println("Deck is empty: " + d1.isEmpty());
		}

		//printout for d2
		System.out.println("\nThe size of Deck 2 is " + d2.size());
		for(int count = d2.size() - 1; count >= 0; count--)
		{
			System.out.println("Dealt card: " + d2.deal());
			System.out.println("Deck is empty: " + d2.isEmpty());
		}

		//printout for d3
		System.out.println("\nThe size of Deck 3 is " + d3.size());
		for(int count = d3.size() - 1; count >= 0; count--)
		{
			System.out.println("Dealt card: " + d3.deal());
			System.out.println("Deck is empty: " + d3.isEmpty());
		}
	}
}
