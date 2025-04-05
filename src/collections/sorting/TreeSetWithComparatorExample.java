package collections.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithComparatorExample {
    public static void main(String[] args) {
        Comparator<String> byLengthThenAlpha = Comparator
                .comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder());

        Set<String> names = new TreeSet<>(byLengthThenAlpha);
        names.addAll(List.of("Ali", "Zeynep", "Ayşe", "Can", "Mehmet"));

        System.out.println("TreeSet sorted by length and then alphabetically:");
        names.forEach(System.out::println);

        // Note: TreeSet and TreeMap require a consistent comparator or Comparable implementation for ordering.
        // Any mismatch can result in ClassCastException at runtime.

    }
}
