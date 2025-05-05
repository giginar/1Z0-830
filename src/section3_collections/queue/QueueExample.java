package section3_collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.offer("Breakfast"); // adds to queue, if success returns true
        tasks.offer("Meeting");
        tasks.add("Coding"); // if capacity is full, an exception will be thrown

        System.out.println("peek(): " + tasks.peek()); // Returns first elements, if empty returns false
        System.out.println("element(): " + tasks.element()); // Returns first elements, if empty NoSuchElementException be thrown

        System.out.println("poll(): " + tasks.poll()); // Removes first element, if empty returns false
        System.out.println("remove(): " + tasks.remove()); // Removes first element, if empty Exception

        System.out.println("Remainings: " + tasks);

    }
}
