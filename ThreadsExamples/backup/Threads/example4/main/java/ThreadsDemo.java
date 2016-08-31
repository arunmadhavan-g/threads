import java.util.Random;

import aggregation.AggregationThread;
import aggregation.SumAggregator;
import passvalue.ComputationThread;
import simple.ExtendsThread;
import simple.ImplementsRunnable;

public class ThreadsDemo {

	public static void main(String[] args) {
		System.out.println("Entering Main Thread");
		
		ExtendsThread thread = new ExtendsThread();
		thread.start();
		
		Thread runnableThread = new Thread(new ImplementsRunnable());
		runnableThread.start();

		Random random  = new Random();
		
		for(int i=0;i<5;i++){
			int loopNumber = random.nextInt(5)+1;
			System.out.println(String.format("For loop %d, loop number passed is %d", i, loopNumber));
			ComputationThread compThread = new ComputationThread(loopNumber);
			compThread.start();
		}
		
		
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
		
		System.out.println("Aggregated Total is "+aggregator.getTotal());
		
		
		System.out.println("Exiting Main Thread");
	}
	
}
