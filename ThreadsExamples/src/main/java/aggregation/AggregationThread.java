package aggregation;

public class AggregationThread  extends Thread{

	private SumAggregator aggregator;
	private int startFrom;
	private int endWith;
	
	public AggregationThread(int startFrom, int endWith, SumAggregator aggregator) {
		this.startFrom = startFrom;
		this.endWith = endWith;
		this.aggregator = aggregator;
	}
	
	@Override
	public void run() {
		int sum = 0;
		for(int i=this.startFrom; i<= this.endWith; i++){
			sum+=i;
		}
		aggregator.add(sum);
		super.run();
	}
}
