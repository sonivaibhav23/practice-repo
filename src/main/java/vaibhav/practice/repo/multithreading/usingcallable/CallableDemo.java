package vaibhav.practice.repo.multithreading.usingcallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable<String> {

	@Override
	public String call() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		return Thread.currentThread().getName();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Callable<String> call1 = new CallableDemo();

		Future<String> future1 = executor.submit(call1);
		Future<String> future2 = executor.submit(call1);
		Future<String> future3 = executor.submit(call1);

		System.out.println("Execution completed of thread : " + future1.get());
		System.out.println("Execution completed of thread : " + future2.get());
		System.out.println("Execution completed of thread : " + future3.get());
	}

}
