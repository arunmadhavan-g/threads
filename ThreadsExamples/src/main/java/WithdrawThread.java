
public class WithdrawThread extends Thread {

	private Account account;
	private double amount;
	
	
	public WithdrawThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		System.out.println("Withdrawing from account an amount of "+this.amount);
		account.withdraw(amount);
		notify();
		super.run();
	}
}
