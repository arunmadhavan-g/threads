import java.util.Random;

public class ThreadsDemo {

	public static void main(String[] args) {
		System.out.println("Entering Main Thread");
		
		ExtendsThread thread = new ExtendsThread();
		thread.start();
		
		Thread runnableThread = new Thread(new ImplementsRunnable());
		runnableThread.start();

		Random random  = new Random();
		
		for(int i=0;i<5;i++){
			int loopNumber = random.nextInt(5)+1;
			System.out.println(String.format("For loop %d, loop number passed is %d", i, loopNumber));
			ComputationThread compThread = new ComputationThread(loopNumber);
			compThread.start();
		}
		
		System.out.println("Exiting Main Thread");
	}
	
}
