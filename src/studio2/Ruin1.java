package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your starting amount: ");
		double startAmount = in.nextDouble();
		System.out.print("Please enter your win chance: ");
		double winChance = in.nextDouble();
		System.out.print("Please enter your win limit: ");
		double winLimit = in.nextDouble();
		double remainingAmount = startAmount;
		int numberOfAttempts = 0;
		String winLose = ""; 
		//		if math.random < win rate, true 
		//		if win, +$1, if loss -$1  
		for(int Days = 0; Days <= 500; Days++ ) {
			numberOfAttempts = 0;
			
			while (remainingAmount > 0 && remainingAmount < winLimit) {
				numberOfAttempts++;
				double randomNumber = (double) Math.random();
				if (randomNumber < winChance) {
					remainingAmount++;
				}
				else {
					remainingAmount--;
				}
				if (randomNumber < winChance) {

				}
				//			System.out.println("Simulation " + numberOfAttempts +": " + remainingAmount);
			}
			if (remainingAmount == winLimit) {
				System.out.println("You Win");
			}
			if (remainingAmount == 0) {
				System.out.println("You Lose");
				
			System.out.println("Simulation " + Days + ":" + numberOfAttempts);

			}
		}
	}
}
