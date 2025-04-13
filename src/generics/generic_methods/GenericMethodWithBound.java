package generics.generic_methods;

public class GenericMethodWithBound {

    public static void main(String[] args) {
        System.out.println(doubleValue(10));     // Integer
        System.out.println(doubleValue(5.5));    // Double
        System.out.println(doubleValue(5.5f));    // Double
        System.out.println(doubleValue(5L));    // Double
        // System.out.println(doubleValue("test")); // ❌ Compile error
    }

    private static <T extends Number> double doubleValue(T number) {
        return number.doubleValue() * 2;
    }

    // 🔹 Bounded Type Parameters: You can restrict a type parameter to a class or interface hierarchy using extends.
}
