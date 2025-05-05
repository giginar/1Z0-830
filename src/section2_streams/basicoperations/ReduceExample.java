package section2_streams.basicoperations;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        int sumSquares = numbers.stream()
                .map(n -> n * n)
                .reduce(0 , Integer::sum);

        System.out.println("Sum of Squares: " + sumSquares);
    }
}
