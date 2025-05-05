package section4_generics.generic_classes_interfaces;

interface Processor<T>{
    void process(T item);
}

class StringProcessor implements Processor<String>{

    @Override
    public void process(String item) {
        System.out.println("Processing String: " + item.toUpperCase());
    }
}

class IntegerProcessor implements Processor<Integer>{

    @Override
    public void process(Integer item) {
        System.out.println("Processing integer squared: " + (item * item));
    }
}
public class GenericInterfaceExample {
    public static void main(String[] args) {
        Processor<String> sp = new StringProcessor();
        sp.process("Hello there!");

        Processor<Integer> ip = new IntegerProcessor();
        ip.process(5);
    }

    // 🔹 Interfaces can be generic, and implementing classes can choose to fix the type or remain generic.
}
