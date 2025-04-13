package generics.generic_methods;

public class GenericMethodExample {
    public static <T> void printArray(T[] array){
        for(T element: array){
            System.out.println(element + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C++"};
        Integer[] numbers = {1, 2, 3, 4};

        printArray(languages);
        printArray(numbers);
    }

    // 🔹 Note: The method declares its own type parameter <T> before the return type.
    //  It is independent from the class (which may or may not be generic).
}
