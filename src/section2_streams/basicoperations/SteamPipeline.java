package section2_streams.basicoperations;

import java.util.List;
import java.util.stream.Collectors;

public class SteamPipeline {
    public static void main(String[] args) {
        List<String> names = List.of("Ali", "Veli", "Ceyda", "Aysenur Su", "Ali");
        List<String> result = names.stream()
                .filter(name -> name.length() > 3)
                .distinct()
                .map(String::toUpperCase)
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
