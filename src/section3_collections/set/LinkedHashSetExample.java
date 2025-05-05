package section3_collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("Ankara"); // Duplicate

        //Note: LinkedHashSet works like HashSet but maintains insertion order.
        System.out.println("LinkedHashSet: " + cities);

        cities.removeIf(city -> city.startsWith("İ"));
        System.out.println("Filtered: " + cities);
    }
}
