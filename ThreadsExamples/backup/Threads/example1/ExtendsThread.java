
public class ExtendsThread extends Thread {

	@Override
	public void run() {
		System.out.println("Entering ExtendsThread.run()");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After the Delay in ExtendsThread.run()");
		super.run();
	}

}
