package vaibhav.practice.repo.temp;

public class CounterThread extends Thread {
    private boolean stop = false;
    private long count = 0;

    public void run() {
        while (!stop) {
            count++;
        }
        System.out.println("Count -> " + count);
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public static void main(String[] args) {
        final CounterThread t1 = new CounterThread();
        t1.start();
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(1000);
                    t1.setStop(true);
                } catch (Exception e) {
                }
            }
        }.start();
    }
}