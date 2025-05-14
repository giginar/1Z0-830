package section10_private_interface_methods;

interface Printer {
    default void printHello() {
        log("Hello");
    }

    default void printBye() {
        log("Goodbye");
    }

    private void log(String message) {
        System.out.println("[LOG] " + message);
    }
}

public class PrivateInstanceMethodExample implements Printer {
    public static void main(String[] args) {
        PrivateInstanceMethodExample p = new PrivateInstanceMethodExample();
        p.printHello(); // prints: [LOG] Hello
        p.printBye();   // prints: [LOG] Goodbye
    }
    // 🔹 log(String) is a private instance method.
    // It's reusable by all default methods but hidden from implementors.
}

