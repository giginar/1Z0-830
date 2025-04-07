package collections.map;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> cities = new LinkedHashMap<>();

        cities.put(34, "Istanbul");
        cities.put(6, "Ankara");
        cities.put(35, "Izmir");

        System.out.println("LinkedHashMap: " + cities); // Maintains insertion order

        // LRU Cache simulation using removeEldestEntry
        LinkedHashMap<Integer, String> lruCache = new LinkedHashMap<>(3, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 3;
            }
        };

        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");
        lruCache.get(1); // access to update order
        lruCache.put(4, "Four"); // removes 2

        System.out.println("LRU Cache simulation: " + lruCache);
    }

    // Note: LinkedHashMap maintains insertion order and is useful for cache-like data structures (e.g., LRU cache).
}

