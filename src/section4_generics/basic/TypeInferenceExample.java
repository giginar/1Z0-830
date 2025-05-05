package section4_generics.basic;

import java.util.*;

public class TypeInferenceExample {
    public static void main(String[] args) {
        // Java infers the generic type from the context
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // The diamond operator <> can be used for inference
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 28);

        System.out.println(ages);
    }

    // 🔹 Note: The diamond operator <> was introduced in Java 7.
    // Java 10+ can use var to further simplify type declarations.
}

