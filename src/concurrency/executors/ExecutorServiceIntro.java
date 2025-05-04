package concurrency.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceIntro {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            System.out.println("Task executed by: " + Thread.currentThread().getName());
        });

        executor.shutdown(); // always shutdown!
    }
    // 🔹 Use Executors.newSingleThreadExecutor() or newFixedThreadPool(n)
    // 🔹 Always call shutdown() or shutdownNow() to release resources
}
