
public class EnquireThread extends Thread{

	private Account account;

	public EnquireThread(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		System.out.println("Account Balance is :"+ account.enquire());
		super.run();
	}
}
