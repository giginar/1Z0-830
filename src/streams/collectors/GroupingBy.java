package streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        Map<Integer, List<String>> groupBy = List.of("java", "go", "kotlin", "python")
                .stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupBy);
    }
}
