package section4_generics.generic_methods;

public class GenericVarargsMethod {

    @SafeVarargs
    public static <T> void printVarargs(T... items){
        for (T item: items){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        printVarargs("Java", "Python", "Go");
        printVarargs(1, 2, 3, 4, 5);
    }

    // ⚠️ Note: Use @SafeVarargs to indicate that the varargs parameter won’t be modified unsafely.
    //  This is very testable in OCP.
}
