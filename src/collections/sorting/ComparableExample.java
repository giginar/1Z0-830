package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    static class Product implements Comparable<Product>{
        String name;
        int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public int compareTo(Product other) {
            return Integer.compare(this.price, other.price);
        }

        @Override
        public String toString() {
            return name + " - " + price + "₺";
        }
    }
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Phone", 800),
                new Product("Laptop", 1500),
                new Product("Tablet", 500)
        );

        List<Product> sorted = new ArrayList<>(products);
        Collections.sort(sorted); // uses comparable

        System.out.println("Sorted by price");
        sorted.forEach(System.out::println);

        // Note: Comparable defines the natural ordering of elements.
        // It's used by Collections.sort(), TreeSet, and TreeMap when no Comparator is provided.

    }

}
