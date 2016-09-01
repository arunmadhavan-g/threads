package passvalue;

import java.util.Random;

public class PassingValueDemo {
	public static void main(String[] args) {
		System.out.println("Entering Main Thread");
		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int loopNumber = random.nextInt(5) + 1;
			System.out.println(String.format("For loop %d, loop number passed is %d", i, loopNumber));
			ComputationThread compThread = new ComputationThread(loopNumber);
			compThread.start();
			System.out.println("Exiting Main Thread");
		}
	}
}
