package section8_io_nio.IOStreams;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            System.out.println("First line: " + br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // ✅ Most IO classes implement Closeable or AutoCloseable.
}

