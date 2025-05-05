package section4_generics.basic;

import java.util.*;

public class RawTypeExample {
    public static void main(String[] args) {
        List list = new ArrayList(); // raw type, no type safety
        list.add("String");
        list.add(123); // compiles, but dangerous!

        for (Object item : list) {
            System.out.println(item);
        }
    }

    // ⚠️ Warning: Raw types bypass generics and can lead to runtime exceptions.
    //  Always use parameterized types like List<String>.
}
