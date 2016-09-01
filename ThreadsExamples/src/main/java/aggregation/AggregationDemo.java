package aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		System.out.println("Entering Main Thread");

		SumAggregator aggregator = new SumAggregator();

		AggregationThread aggrThread1 = new AggregationThread(1, 10, aggregator);
		AggregationThread aggrThread2 = new AggregationThread(11, 20, aggregator);
		AggregationThread aggrThread3 = new AggregationThread(21, 30, aggregator);
		AggregationThread aggrThread4 = new AggregationThread(31, 40, aggregator);
		AggregationThread aggrThread5 = new AggregationThread(41, 50, aggregator);

		aggrThread1.start();
		aggrThread2.start();
		aggrThread3.start();
		aggrThread4.start();
		aggrThread5.start();

		try {
			aggrThread1.join();
			aggrThread2.join();
			aggrThread3.join();
			aggrThread4.join();
			aggrThread5.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Aggregated Total is " + aggregator.getTotal());

		System.out.println("Exiting Main Thread");

	}

}
