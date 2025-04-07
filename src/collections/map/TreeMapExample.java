package collections.map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> population = new TreeMap<>();

        population.put("Ankara", 5_000_000);
        population.put("Istanbul", 15_000_000);
        population.put("Izmir", 4_000_000);
        population.put("Bursa", 3_000_000);

        System.out.println("TreeMap: " + population); // Alphabetical order

        // NavigableMap methods
        System.out.println("First key: " + population.firstKey());
        System.out.println("Last key: " + population.lastKey());
        System.out.println("Head map (< Istanbul): " + population.headMap("Istanbul"));
        System.out.println("Tail map (>= Istanbul): " + population.tailMap("Istanbul"));

        // SubMap
        SortedMap<String, Integer> midRange = population.subMap("Ankara", "Izmir");
        System.out.println("SubMap: " + midRange);

        // ceilingKey / floorKey
        System.out.println("Ceiling of 'H': " + population.ceilingKey("H"));
        System.out.println("Floor of 'H': " + population.floorKey("H"));

        // Custom comparator (reverse order)
        TreeMap<Integer, String> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.put(10, "Ten");
        reverseMap.put(5, "Five");
        reverseMap.put(15, "Fifteen");

        System.out.println("Reverse sorted TreeMap: " + reverseMap);
    }

    // 🔹 Note: TreeMap keeps keys sorted either naturally (Comparable) or via a provided Comparator.
}

