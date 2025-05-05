package section4_generics.generic_methods;

public class GenericMethodWithReturn {
    public static <T> T getFirst(T[] array) {
        return array.length > 0 ? array[0] : null;
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        Integer[] ages = {25, 30, 35};

        String firstName = getFirst(names);
        Integer firstAge = getFirst(ages);

        System.out.println("First name: " + firstName);
        System.out.println("First age: " + firstAge);
    }
    // 🔹 Tip: Generic return types make methods flexible and reusable.
}
