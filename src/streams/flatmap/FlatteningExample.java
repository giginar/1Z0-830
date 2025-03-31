package streams.flatmap;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatteningExample {
    public static void main(String[] args) {
        List<List<String>> nested = List.of(
                List.of("a", "b"),
                List.of("c", "d")
        );

        List<String> flattened = nested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(flattened);
    }
}
