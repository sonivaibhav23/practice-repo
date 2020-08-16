package vaibhav.practice.repo.multithreading.usingrunnable;

public class RunnableDemo implements Runnable {
	
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
		Thread t1 = new Thread(new RunnableDemo(), "t1");
		Thread t2 = new Thread(new RunnableDemo(), "t2");
		
		t1.start();
		t2.start();
	}

}
