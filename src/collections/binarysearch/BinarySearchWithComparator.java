package collections.binarysearch;

import java.util.*;

public class BinarySearchWithComparator {
    static class Book {
        String title;

        public Book(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(List.of(
                new Book("Java"),
                new Book("Python"),
                new Book("Go"),
                new Book("Rust")
        ));

        Comparator<Book> byLength = Comparator.comparingInt(b -> b.title.length());

        // Sort using custom comparator
        books.sort(byLength);

        int index = Collections.binarySearch(books, new Book("Scala"), byLength);
        System.out.println("Index of 'Scala': " + index); // if not found → negative
    }

    // 🔹 Note: When sorting with a Comparator, you must use the same comparator when performing binarySearch,
    // otherwise the behavior is undefined.
}

