package shared.synchronization;
import java.util.Random;

public class SharedObjectThreadDemo {

	private static final String[] OPERATIONS = {"deposit","withdraw","enquire"};
	public static void main(String[] args) {
		Account account = new Account("Arun");
		Random random = new Random();
		
		for(int i=0;i<10;i++){
			BankThread onlineBanking  = new BankThread(account, getOperation(random), getAmount(random)); 
			onlineBanking.start();
		}
	}

	private static Double getAmount(Random random) {
		return random.nextDouble()*1000;
	}

	private static String getOperation(Random random) {
		return OPERATIONS[random.nextInt(3)];
	}
}
