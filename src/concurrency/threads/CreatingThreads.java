package concurrency.threads;

public class CreatingThreads {
    public static void main(String[] args) {
        // Option 1: Using Runnable and Thread
        Runnable task = () -> System.out.println("Hello from Runnable on " + Thread.currentThread().getName());
        Thread thread = new Thread(task);
        thread.start();

        // Option 2: Extending Thread class
        Thread extended = new Thread() {
            @Override
            public void run() {
                System.out.println("Hello from extended Thread on " + getName());
            }
        };
        extended.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());

        // Note: Thread and Runnable are fundamental. Prefer Runnable + Thread over inheritance for flexibility.
    }
}
