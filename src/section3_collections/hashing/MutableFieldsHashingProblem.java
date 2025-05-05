package section3_collections.hashing;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MutableFieldsHashingProblem {
    static class Book {
        String title;

        public Book(String title) {
            this.title = title;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Book)) return false;
            return Objects.equals(title, ((Book) o).title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title);
        }

        @Override
        public String toString() {
            return title;
        }
    }
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        Book b = new Book("Java");

        books.add(b);
        System.out.println("Contains 'Java'? " + books.contains(b)); // true

        // Mutate the object after adding
        b.title = "Python";

        System.out.println("Contains 'Python'? " + books.contains(b)); // false!
        books.remove(b); // also fails to remove

        System.out.println("Set contents: " + books);

    }

    // ⚠️ Warning: Mutating fields that affect hashCode() after insertion leads to broken hash behavior —
    // the object becomes "invisible" to the structure.
}
