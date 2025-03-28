package lambda.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> toLength = s -> s.length();
        System.out.println(toLength.apply("what is the length"));

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(2,4));
    }
}
