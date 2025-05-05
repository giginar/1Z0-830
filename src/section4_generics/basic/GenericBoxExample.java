package section4_generics.basic;

public class GenericBoxExample {
    static class Box<T> {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get(){
            return value;
        }
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("String Box: " + stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(42);
        System.out.println("Integer Box: " + integerBox.get());
    }

    // 🔹 Note: Box<T> is a generic class. The type T is specified
    // during instantiation and provides compile-time type safety.
}
