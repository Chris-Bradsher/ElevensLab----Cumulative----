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
		Card[] cards = new Card[3]; 
		cards[0] = new Card ("Five", "Spades", 5);
		cards[1] = new Card ("Seven", "Hearts", 7);
		cards[2] = new Card ("King", "Diamonds", 13);
		for (int i=0; i<3; i++){
			System.out.println("Card number " + i + " is the " + cards[i].toString());;
		}
	}
}
