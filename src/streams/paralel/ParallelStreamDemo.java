package streams.paralel;

import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g");

        list.parallelStream()
                .map(String::toUpperCase)
                .forEach(System.out::println); // May be unsorted
    }
}
