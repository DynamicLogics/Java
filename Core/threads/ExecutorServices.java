package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServices {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Runnable runA = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable Function A");
			}
		};
		
		Runnable runB = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable Function B");
			}
		};
		
		Callable<String> callA = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "Callable Function A";
			}
		};
		
		Callable<String> callB = new Callable<String>() {
			@Override
			public String call() throws Exception {
				return "Callable Function B";
			}
		};
		
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		//Calling Runnable interface objects
		exec.execute(runA);
		//exec.execute(runB);
		
		//Calling Callable interface objects
		/*
		 * Using Java Future object, we can find out the status of the Callable task 
		 * and get the returned Object. It provides get() method that can wait for 
		 * the Callable to finish and then return the result.
		 * Java Future provides cancel() method to cancel the associated Callable task.
		 */
		Future<String> futureA = exec.submit(callA);
		Future<String> futureB = exec.submit(callB);
		
		String A = futureA.get();
		String B = futureB.get();
		
		System.out.println(A+" "+B);
		
	}

}
