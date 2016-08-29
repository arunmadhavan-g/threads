import java.util.Random;

public class SharedObjectThreadDemo {

	public static void main(String[] args) {
		Account account = new Account();
		
		Random random = new Random();
		for(int i=0;i<5;i++){
			double depAmount = random.nextDouble()*1000;
			DepositThread deposit = new DepositThread(account, depAmount);
			deposit.start();
			
			double withAmount = random.nextDouble()*1000;
			WithdrawThread withdraw = new WithdrawThread(account, withAmount);
			withdraw.start();
		}
		
		EnquireThread enquireThread = new EnquireThread(account);
		enquireThread.start();
	}
}
