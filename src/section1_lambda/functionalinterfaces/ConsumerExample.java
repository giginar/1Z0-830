package section1_lambda.functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println("Print: " + s);
        printer.accept("Testing Consumer");

        BiConsumer<String, Integer> repeater = (s, integer) -> {
            for (int i= 0; i<integer; i++){
                System.out.println(s);
            }
        };

        repeater.accept("BiConsumer Testing ", 3);
    }
}
