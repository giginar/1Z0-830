package generics.generic_methods;

import java.util.List;
import java.util.Objects;

public class UtilityClassWithStaticGenericMethod {

    public static <T> boolean contains(List<T> list, T element){
        for (T item: list){
            if (Objects.equals(item, element)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Green", "Blue");

        System.out.println(contains(colors, "Green")); // true
        System.out.println(contains(colors, "Yellow")); // false
    }

    //  🔹 Generic utility methods like this are common in libraries such as Guava, Apache Commons, or Java's own Collections API.
}
