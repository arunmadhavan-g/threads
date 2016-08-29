import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ThreadsDemoTest {

	@Test
	public void extendsThread() throws Exception {
		System.out.println("Entering Test Thread");
		ExtendsThread thread = new ExtendsThread();
		thread.start();
		System.out.println("Exiting Test Thread");
	}
	
	@Test
	public void implementsRunnable() throws Exception {
		System.out.println("Entering Test Thread");
		Thread runnableThread = new Thread(new ImplementsRunnable());
		runnableThread.start();
		System.out.println("Exiting Test Thread");
	}
	
	@Test
	public void passingValueToThread() throws Exception {
		System.out.println("Entering Test Thread");
		Random random  = new Random();
		for(int i=0;i<5;i++){
			int loopNumber = random.nextInt(5)+1;
			System.out.println(String.format("For loop %d, loop number passed is %d", i, loopNumber));
			ComputationThread compThread = new ComputationThread(loopNumber);
			compThread.start();
		}
		System.out.println("Exiting Test Thread");
	}
	
	
}
