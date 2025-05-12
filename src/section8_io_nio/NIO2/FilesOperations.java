package section8_io_nio.NIO2;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class FilesOperations {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("nio-sample.txt");

        Files.write(path, List.of("Line 1", "Line 2"));
        List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);

        System.out.println("File exists? " + Files.exists(path));
        System.out.println("Size: " + Files.size(path) + " bytes");
    }
}

