package lambda.functionalinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Operators {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;
        BinaryOperator<Integer> max = (a, b) -> a > b ? a : b;

        System.out.println(square.apply(5));
        System.out.println(max.apply(5, 6));
    }
}
