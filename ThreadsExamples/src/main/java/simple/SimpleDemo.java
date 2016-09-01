package simple;

public class SimpleDemo {

	public static void main(String[] args) {
		System.out.println("Entering Main Thread");
		
		ExtendsThread thread = new ExtendsThread();
		thread.start();
		
		Thread runnableThread = new Thread(new ImplementsRunnable());
		runnableThread.start();
		
		System.out.println("Exiting Main Thread");
	}
}
