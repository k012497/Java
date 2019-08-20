package chapter04;

public class RandomCard {

	public static void main(String[] args) {
		String[] card1 = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] card2 ={ "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		System.out.println(card1[(int)(Math.random()*(card1.length-1-0+1)+1)]);
		System.out.println(card2[(int)(Math.random()*(card2.length-1-0+1)+1)]);	
	}
}
