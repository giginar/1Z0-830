package section8_io_nio.IOStreams;

import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String path = "example.txt";

        // Writing to file
        try (FileWriter fw = new FileWriter(path)) {
            fw.write("Hello, world!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from file
        try (FileReader fr = new FileReader(path)) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

