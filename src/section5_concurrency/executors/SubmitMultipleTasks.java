package section5_concurrency.executors;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitMultipleTasks {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task1 = () -> "Task1 result";
        Callable<String> task2 = () -> "Task2 result";

        List<Callable<String>> tasks = List.of(task1, task2);

        List<Future<String>> futures = executor.invokeAll(tasks);

        for (Future<String> future : futures) {
            System.out.println("Result: " + future.get());
        }

        executor.shutdown();
    }
    // 🔹 invokeAll() blocks until all tasks finish and returns a list of Futures
    // 🔹 Use Callable<T> for returning results from threads
}
