package section10_private_interface_methods;

public class PrivateStaticMethodExample {
    public static void main(String[] args) {
        System.out.println(StringUtils.toUpper("java"));
        System.out.println(StringUtils.toLower("JAVA"));
    }
    // 🔹 validate(String) is a private static method.
    // It reduces code duplication across static methods.
}

interface StringUtils {
    static String toUpper(String input) {
        validate(input);
        return input.toUpperCase();
    }

    static String toLower(String input) {
        validate(input);
        return input.toLowerCase();
    }

    private static void validate(String input) {
        if (input == null || input.isBlank())
            throw new IllegalArgumentException("Input cannot be null or blank");
    }
}

interface InvalidUsage {
    // public private void oops(); ❌ invalid combination
    // private abstract void test(); ❌ private + abstract illegal
    // private void log(); ❌ must have a body

    // 🔴 Private methods must have a body, and cannot be abstract.
}
