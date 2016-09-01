package shared.synchronization;

public class Account {

	private double total;
	private String name;
	
	public Account(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void deposit(double amount){
		total+=amount;
	}
	
	public void withdraw(double amount){
		total-=amount;
	}
	
	public void enquire(){
		System.out.println(String.format("The balance of account, belonging to %s is %.2f", name, total));
	}
}
