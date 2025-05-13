package section9_lvti;

import java.util.function.Consumer;

public class VarInLambdas {
    public static void main(String[] args) {
        // Java 11 allows 'var' in lambda parameters (must be all var or none)
        Consumer<String> printer = (var s) -> System.out.println(s.toUpperCase());

        printer.accept("hello");

        // You can also annotate lambda parameters (rare)
        Consumer<String> validated = (@Deprecated var s) -> System.out.println(s);
    }
    // ✅ Java 11 feature: var in lambda parameters
    // All parameters must use var if any do — you can’t mix var with explicit types.
}

