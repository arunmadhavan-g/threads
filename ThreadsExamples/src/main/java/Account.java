
public class Account {

	private double total;
	
	public synchronized void deposit(double amount){
		total+=amount;
	}
	
	public synchronized void withdraw(double amount){
		total-=amount;
	}
	
	public synchronized double enquire(){
		return total;
	}
}
