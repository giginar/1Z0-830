package section4_generics.generic_classes_interfaces;

class Container<T> {
    T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}

// Concrete subclass
class StringContainer extends Container<String> {
    public void shout() {
        System.out.println("Shouting: " + get().toUpperCase());
    }
}

// Generic subclass
class LoggingContainer<T> extends Container<T> {
    @Override
    public void set(T content) {
        System.out.println("Setting value: " + content);
        super.set(content);
    }
}

public class GenericClassInheritance {
    public static void main(String[] args) {
        StringContainer sc = new StringContainer();
        sc.set("hello");
        sc.shout();

        LoggingContainer<Integer> lc = new LoggingContainer<>();
        lc.set(123);
        System.out.println("Logged value: " + lc.get());
    }

    // 🔹 You can specialize a generic class by fixing its type in the subclass, or extend it generically.
}
