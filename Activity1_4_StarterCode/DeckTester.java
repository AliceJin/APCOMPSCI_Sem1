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
		Deck d1 = new Deck({"A", "B", "C"}, {"Giraffes", "Lions"},{2,1,6});

		System.out.println("The size of Deck 1" + d1.size());
		for(int count = d1.size() - 1; count > 0; count--)
		{
			System.out.println("Dealt card: " + d1.deal().toString());
		}
	}
}
