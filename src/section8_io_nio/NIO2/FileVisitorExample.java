package section8_io_nio.NIO2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorExample {
    public static void main(String[] args) throws IOException {
        Path start = Path.of(".");

        Files.walkFileTree(start, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                System.out.println("Visited file: " + file);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
