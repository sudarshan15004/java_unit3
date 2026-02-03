class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class SyncDemo extends Thread {
    static Counter c = new Counter();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SyncDemo t1 = new SyncDemo();
        SyncDemo t2 = new SyncDemo();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + c.count);
    }
}
