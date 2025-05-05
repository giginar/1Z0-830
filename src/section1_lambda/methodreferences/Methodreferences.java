package section1_lambda.methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Methodreferences {
    public static void main(String[] args) {
        // Lambda: str -> System.out.println();
        Consumer<String> print = System.out::println;

        // Lambda: () -> new ArrayList();
        Supplier<List<String>> listSupplier = ArrayList::new;

        // Lambda: str -> str.toUpperCase;
        Function<String, String> toUpper = String::toUpperCase;
    }
}
