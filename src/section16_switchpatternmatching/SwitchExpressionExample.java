package section16_switchpatternmatching;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        int day = 2;

        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> throw new IllegalArgumentException("Invalid day");
        };

        System.out.println(result);
        // 🔹 This is a switch expression, not a statement — it yields a value.

        String category = switch (day) {
            case 0, 1, 2 -> "Low";
            case 3, 4 -> {
                System.out.println("Medium score detected");
                yield "Medium";
            }
            default -> "High";
        };
        // ✅ yield is used to return values from a block switch arm.

        Object value = null;

        String result2 = switch (value) {
            case null -> "Null value!";
            case String s -> "String: " + s;
            default -> "Something else";
        };
        // 🚫 In older Java versions, this would cause a NullPointerException. Now it’s safe.
    }
}
