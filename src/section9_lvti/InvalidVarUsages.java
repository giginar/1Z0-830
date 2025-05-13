package section9_lvti;

public class InvalidVarUsages {
    public static void main(String[] args) {
        // var x; ❌ Error: cannot use 'var' without initializer
        // var nullVar = null; ❌ Error: null has no type
        // var lambda = () -> System.out.println("Hi"); ❌ Not allowed — target type required
        // var[] arr = {1, 2, 3}; ❌ Cannot use 'var' with array initializer
    }
    // ⚠️ Common mistakes include:
    // - Using var without initializer
    // - Trying to assign null
    // - Ambiguous lambda or method references
    // - Array initializers without explicit type
}

