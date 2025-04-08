package collections.binarysearch;

import java.util.*;

public class BinarySearchStringExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ayşe", "Ali", "Zeynep", "Mehmet", "Veli"));

        Collections.sort(names); // must sort first

        int index = Collections.binarySearch(names, "Mehmet");
        System.out.println("'Mehmet' found at index: " + index);
    }
}

