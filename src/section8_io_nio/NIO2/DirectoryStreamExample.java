package section8_io_nio.NIO2;

import java.io.IOException;
import java.nio.file.*;

public class DirectoryStreamExample {
    public static void main(String[] args) {
        Path dir = Path.of(".");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.txt")) {
            for (Path entry : stream) {
                System.out.println("Found: " + entry.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

