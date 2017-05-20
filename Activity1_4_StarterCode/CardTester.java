/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("7", "Hearts", 7);
		Card c2 = new Card("K", "Spades", 13);
		Card c3 = new Card("7", "Hearts", 7);

		//Accessors for c1
		System.out.println("Card 1 - rank: " + c1.rank() + " suit: " +
		c1.suit() + " pointValue: " + c1.pointValue());

		//test each accessor indirectly through the matches method */
		System.out.println("Card1 matches Card2: " + c1.matches(c2));
		System.out.println("Card2 matches Card3: " + c2.matches(c3));
		System.out.println("Card1 matches Card3: " + c3.matches(c1));

		System.out.println("These are the cards: ");
		System.out.println("Card1 is " + c1.toString());
		System.out.println("Card2 is " + c2.toString());
		System.out.println("Card3 is " + c3.toString());
	}
}
