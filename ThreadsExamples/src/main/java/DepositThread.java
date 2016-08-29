
public class DepositThread extends Thread{

	private Account account;
	private double amount;
	
	public DepositThread(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		System.out.println("Depositing int account an amount of "+ this.amount);
		account.deposit(amount);
		notify();
		super.run();
	}
}
