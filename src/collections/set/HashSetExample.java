package collections.set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Banana"); // Duplicate, Set does not contain duplicate

        System.out.println("HashSet: " + fruits); // Unorded

        System.out.println("Do we have Kiwi? " + fruits.contains("Kiwi"));

        fruits.remove("Banana");
        System.out.println("Size: " + fruits.size());
        System.out.println("Is Empty? " + fruits.isEmpty());

        for (String fruit: fruits){
            System.out.println("Fruit: " + fruit);
        }

        Object[] array = fruits.toArray();
        System.out.println("Array Length: " + array.length);

        fruits.clear();
        System.out.println("Does clear work?: " + fruits.isEmpty());

    }
}
