package chapter09.dice_game;

public class Game {
	public static void main(String[] args) {
		Dice dice = new Dice();
		dice.setValue();
		int dots = dice.getValue();
		
		Dice computer = new Dice();
		computer.setValue();
		
		int result = computer.getValue() - dice.getValue();
		
		if (result < 0) System.out.println("win");
		else if (result > 0) System.out.println("lose");
		else  System.out.println("draw");
		
	}
	
}
