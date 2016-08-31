package passvalue;

public class ComputationThread extends Thread {

	private int loopNumber;
	
	public ComputationThread(int loopNumber) {
		this.loopNumber = loopNumber;
	}
	
	@Override
	public void run() {
		
		System.out.println("Print the Numbers For given value:"+ this.loopNumber);
		
		StringBuffer buff = new StringBuffer("Computed Sequence: ");
		for(int i=1;i<=this.loopNumber;i++){
			buff.append(i).append(",");
		}
		System.out.println(buff.toString());
		System.out.println("----------------------------------------------------");
		
		super.run();
	}
	
}
