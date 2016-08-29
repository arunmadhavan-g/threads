package aggregation;

public class SumAggregator {

	private int total;
	
	public void add(int sum){
		total += sum;
	}
	
	public int getTotal(){
		return total;
	}
}
