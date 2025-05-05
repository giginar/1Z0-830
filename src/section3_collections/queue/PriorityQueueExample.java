package section3_collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // natural order (small → big)

        pq.add(50);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq); // internal order not guaranteed!

        while (!pq.isEmpty()) {
            System.out.println("Smallest: " + pq.poll()); // orderly removed: 10, 20, 50
        }

        // Custom comparator (decreasing)
        PriorityQueue<String> reverseNames = new PriorityQueue<>(Comparator.reverseOrder());
        reverseNames.offer("Ali");
        reverseNames.offer("Zeynep");
        reverseNames.offer("Mehmet");

        System.out.println("Reversed ordered removal:");
        while (!reverseNames.isEmpty()) {
            System.out.println(reverseNames.poll()); // Zeynep, Mehmet, Ali
        }

        // Note: PriorityQueue removes elements based on natural or custom-defined priority.
        // It is not a FIFO structure. Internally, it operates as a min-heap.
    }
}
