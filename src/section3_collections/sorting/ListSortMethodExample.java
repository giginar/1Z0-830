package section3_collections.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortMethodExample {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>(List.of("Java", "Kotlin", "Go", "Python"));

        // Natural order
        languages.sort(Comparator.naturalOrder());
        System.out.println("Alphabetical: " + languages);

        // Sort by length
        languages.sort(Comparator.comparingInt(String::length));
        System.out.println("Sorted by length: " + languages);

        // Note: List.sort() is preferred over Collections.sort() in Java 8+ for better readability and performance.
    }
}
