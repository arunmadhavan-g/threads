package shared.synchronization;

public class BankThread extends Thread {

	private Account account;
	private String operation;
	private Double amount;

	public BankThread(Account account, String operation, Double amount) {
		this.account = account;
		this.operation = operation;
		this.amount = amount;
	}

	@Override
	public void run() {
		synchronized (account) {
			System.out.println(String.format("Operating on %s account and doing a %s or amount %.2f", account.getName(),
					operation, amount));
			switch (this.operation) {
				case "deposit": account.deposit(amount); break;
				case "withdraw": account.withdraw(amount); break;
				case "enquire": account.enquire(); break;
				default: account.enquire();
			}
		}
		super.run();
	}

}
