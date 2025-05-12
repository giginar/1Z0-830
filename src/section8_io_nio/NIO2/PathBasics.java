package section8_io_nio.NIO2;

import java.nio.file.*;

public class PathBasics {
    public static void main(String[] args) {
        Path path = Path.of("example.txt");
        System.out.println("File name: " + path.getFileName());
        System.out.println("Absolute: " + path.toAbsolutePath());
        System.out.println("Parent: " + path.getParent());
    }
}

