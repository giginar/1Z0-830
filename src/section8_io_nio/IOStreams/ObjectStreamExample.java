package section8_io_nio.IOStreams;

import java.io.*;
import java.util.*;

public class ObjectStreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("names.ser"))) {
            out.writeObject(names);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("names.ser"))) {
            List<String> read = (List<String>) in.readObject();
            System.out.println("Deserialized: " + read);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    // 🔹 All objects must implement Serializable.
}

