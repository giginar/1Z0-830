package section3_collections.set;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> population = new TreeMap<>();

        population.put("Ankara", 5_000_000);
        population.put("İstanbul", 16_000_000);
        population.put("İzmir", 4_000_000);
        population.put("Bursa", 3_000_000);

        System.out.println("TreeMap: " + population); // Alfabeticly ordered

        System.out.println("First city: " + population.firstKey());
        System.out.println("Last city: " + population.lastKey());
        System.out.println("Small cities: " + population.headMap("İstanbul"));
        System.out.println("Large cities: " + population.tailMap("İstanbul"));

        SortedMap<String, Integer> midRange = population.subMap("Ankara", "İzmir");
        System.out.println("Submap: " + midRange);

        System.out.println("Ceiling (H): " + population.ceilingKey("H"));
        System.out.println("Floor (H): " + population.floorKey("H"));

        TreeMap<Integer, String> reverseMap = new TreeMap<>(Comparator.reverseOrder());
        reverseMap.put(10, "Ten");
        reverseMap.put(5, "Five");
        reverseMap.put(15, "Fifteen");

        System.out.println("Reversed ordered map: " + reverseMap);
        // Note: TreeSet requires Comparable or Comparator for ordering. It does not allow null as the first element.
    }
}
