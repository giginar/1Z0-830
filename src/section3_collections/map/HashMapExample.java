package section3_collections.map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        // Add elements
        scores.put("Ali", 85);
        scores.put("Ayşe", 90);
        scores.put("Veli", 78);

        // Overwrite existing key
        scores.put("Ali", 95);

        // Access values
        System.out.println("Ali's score: " + scores.get("Ali"));

        // Check for keys and values
        System.out.println("Contains Ayşe? " + scores.containsKey("Ayşe"));
        System.out.println("Contains 95? " + scores.containsValue(95));

        // Get keys and values
        System.out.println("Names: " + scores.keySet());
        System.out.println("Scores: " + scores.values());

        // Iterate with entrySet
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Default value if key doesn't exist
        System.out.println("Ahmet's score: " + scores.getOrDefault("Ahmet", 0));

        // Replace
        scores.replace("Veli", 78, 80);

        // Remove
        scores.remove("Ayşe");

        // computeIfAbsent and computeIfPresent
        scores.computeIfAbsent("Can", k -> 100);
        scores.computeIfPresent("Ali", (k, v) -> v + 5);

        // Merge values
        scores.merge("Ali", 10, Integer::sum);

        System.out.println("Final scores: " + scores);
    }
}
