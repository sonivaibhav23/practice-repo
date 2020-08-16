package vaibhav.practice.repo.multithreading.usingthread;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Executing : " + Thread.currentThread().getName());

			doSomething();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void doSomething() throws InterruptedException {
		System.out.println("Processing records...");
		Thread.sleep(5000);
		System.out.println("Processing completed!!!");
	}

	public static void main(String[] args) {
		Thread thread1 = new ThreadDemo();
		Thread thread2 = new ThreadDemo();

//		long start = System.currentTimeMillis();
		thread1.start();
		thread2.start();

//		System.out.println("Total time taken : " + (System.currentTimeMillis() - start));
	}

}
