package section16_switchpatternmatching;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello world";

        String result = switch (obj) {
            case Integer i -> "Integer: " + (i * 2);
            case String s -> "String length: " + s.length();
            case null -> "Null!";
            default -> "Unknown type";
        };

        System.out.println(result);
    }
    // 🔥 You can now switch directly on the type (String, Integer, etc.) and assign it to a variable in the case.
    Object input = "super";

    String result = switch (input) {
        case String s when s.length() > 5 -> "Long string";
        case String s -> "Short string";
        default -> "Not a string";
    };
    // ✅ Guards add extra logic after the pattern match.
}

