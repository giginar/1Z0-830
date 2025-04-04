package collections.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        numbers.addFirst(10);
        numbers.addLast(20);
        numbers.offerFirst(5);
        numbers.offerLast(25);

        System.out.println("Deque: " + numbers);

        System.out.println("First: " + numbers.getFirst()); // 5
        System.out.println("Last: " + numbers.getLast());  // 25

        numbers.removeFirst(); // 5 removed
        numbers.removeLast();  // 25 removed

        System.out.println("Remainings: " + numbers);

        // Advantage: ArrayDeque is faster than LinkedList because it does not use node-based structure.
    }
}
