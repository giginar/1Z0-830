package concurrency.threads;

public class SleepAndJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread sleeper = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Slept for 2 seconds");
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        });

        sleeper.start();
        sleeper.join(); // waits for sleeper to finish

        System.out.println("Main thread continues after join");
    }
    // 🔹 Thread.sleep(ms) pauses the thread
    // 🔹 thread.join() causes the current thread to wait for another to finish
}
