package collections.binarysearch;

import java.util.*;

public class BinarySearchSimpleExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));

        int index = Collections.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index); // 2

        int notFound = Collections.binarySearch(numbers, 35);
        System.out.println("Index of 35: " + notFound); // -4 → insertion point = 3
    }

    // 🔹 Note: If the element is not found, the method returns -(insertionPoint) - 1.
    //  So -4 means “would be inserted at index 3.”
}
