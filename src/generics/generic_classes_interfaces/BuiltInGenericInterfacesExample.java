package generics.generic_classes_interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInGenericInterfacesExample {
    public static void main(String[] args) {
        // Supplier<T> supplies values
        Supplier<String> messageSupplier = () -> "Hello from Supplier!";
        System.out.println(messageSupplier.get());

        // Consumer<T> consumes values
        Consumer<Integer> squarePrinter = x -> System.out.println(x * x);
        squarePrinter.accept(5);

        // Predicate<T> tests values
        Predicate<String> isShort = s -> s.length() < 5;
        System.out.println("Is 'Hi' short? " + isShort.test("Hi"));

        // Function<T, R> maps input to output
        Function<String, Integer> lengthMapper = s -> s.length();
        System.out.println("Length of 'Java': " + lengthMapper.apply("Java"));

        // Comparator<T> compares two values
        Comparator<String> byLength = Comparator.comparingInt(String::length);
        List<String> list = new ArrayList<>(List.of("Go", "Java", "Rust", "Kotlin"));
        list.sort(byLength);
        System.out.println("Sorted by length: " + list);
    }

    // ✅ These functional interfaces from java.util.function package are used everywhere in Java’s APIs.
}
