package streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args) {
        Map<Boolean, List<String>> partitioned = List.of("java", "go", "kotlin", "python")
                .stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 3));

        System.out.println(partitioned);
    }
}
