package section8_io_nio.IOStreams;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        String file = "buffered.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Line 1\nLine 2\nLine 3");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

