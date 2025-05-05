package section3_collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonListMethods {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 2, 8, 1, 3));

        Collections.sort(numbers);
        System.out.println("Sıralı: " + numbers);

        Collections.reverse(numbers);
        Collections.shuffle(numbers);

        System.out.println("Min: " + Collections.min(numbers));
        System.out.println("Max: " + Collections.max(numbers));

        System.out.println("Kaç tane 2 var? - " + Collections.frequency(numbers, 2));

        Collections.replaceAll(numbers, 2, 90);
        System.out.println("Son hali: " + numbers);

    }
}
