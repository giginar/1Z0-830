package section1_lambda.functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        System.out.println(isLongerThan5.test("Java is a great language"));
        System.out.println(isLongerThan5.test("Java"));

        BiPredicate<String, Integer> checkLength = (string, len) -> string.length() == len;
        System.out.println(checkLength.test("Java", 4));
        System.out.println(checkLength.test("Java is a great language", 4));
    }
}
