package section9_lvti;

import java.util.*;

public class CollectionsWithVar {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Java");
        list.add("OCP");

        for (var item : list) {
            System.out.println(item.toUpperCase());
        }

        var map = Map.of(1, "One", 2, "Two");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
    // 🔹 var works great with generics — especially on the right-hand side of assignments.
    // 🔸 Type is inferred from the expression, not the variable name.
}

