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
		double numberOfSimulation = 0;
		System.out.println("How many days do you want to gamble for?");
		int days = in.nextInt();
		String outcome = "win";
		double Losses = 0; 
		double events = 1;
		//		if math.random < win rate, true 
		//		if win, +$1, if loss -$1  
		for(events = 1; events < days + 1; events++) {
			remainingAmount = startAmount;
			numberOfSimulation = 0;
		while (remainingAmount > 0 && remainingAmount < winLimit) {
			numberOfSimulation++;
			double randomNumber = (double) Math.random();
			if (randomNumber < winChance) {
				remainingAmount++;
			}
			else {
				remainingAmount--;
			}
			
			if (remainingAmount == winLimit) {
				outcome = "Win";
			}
			if (remainingAmount == 0) {
				outcome = "Loss";
				Losses++;
			}

		// System.out.println("Simulation " + numberOfSimulation +": " + remainingAmount);
		}
		System.out.println("Simulation " + events + ": " + numberOfSimulation + " " + outcome);

		// if (remainingAmount == winLimit) {
		//	System.out.println("You Win");
		// }
	// 	if (remainingAmount == 0) {
		//	System.out.println("You Lose");
		}
		System.out.println("Losses: " + Losses + " Simulations: " + events);
		System.out.println("Ruin rate from simulation: " + Math.round(Losses/events*100)/100 + "%");

	}
}
