package simple;

public class ImplementsRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Entering ImplementsRunnable.run()");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After the delay in ImplementsRunnable.run()");
	}

	
}
