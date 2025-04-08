package collections.binarysearch;

import java.util.*;

public class BinarySearchUnsortedList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(30, 10, 20, 50, 40));

        int index = Collections.binarySearch(numbers, 20);
        System.out.println("Result on unsorted list: " + index); // unpredictable!
    }

    // ⚠️ Warning: binarySearch on an unsorted list may return incorrect or meaningless results.
    //  Always sort the list first.
}
