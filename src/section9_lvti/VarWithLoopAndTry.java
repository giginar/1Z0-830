package section9_lvti;

import java.io.*;
import java.util.*;

public class VarWithLoopAndTry {
    public static void main(String[] args) throws IOException {
        var numbers = List.of(10, 20, 30);

        for (var n : numbers) {
            System.out.println("Number: " + n);
        }

        try (var reader = new BufferedReader(new FileReader("example.txt"))) {
            System.out.println("First line: " + reader.readLine());
        }
    }
    // 🔹 var is allowed in:
    // - Enhanced for loops
    // - Try-with-resources
    // - Traditional variable declarations
}

