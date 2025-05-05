package section3_collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println("Poped: " + stack.pop()); // 3

        // Queue like usage
        stack.offerFirst("head");
        stack.offerLast("tail");

        System.out.println("First: " + stack.peekFirst());
        System.out.println("Last: " + stack.peekLast());

        System.out.println("Removed: " + stack.pollFirst());
        System.out.println("Removed: " + stack.pollLast());

        System.out.println("Remainings: " + stack);

//      Note: Deque stands for "double-ended queue".
//      Elements can be added or removed from both ends, making it behave like both a Stack and a Queue.
    }
}
