package section14_sealed_classes;

public class InvalidUsages {
}

sealed class Invalid permits X {} // ❌ class X is not declared

class X extends Invalid {} // ✅ but only if you declare it!

// ✅ Each permitted subclass MUST declare one of:
final class X extends Invalid {}
non-sealed class X extends Invalid {}
sealed class X extends Invalid permits ... {}

// ⚠️ The compiler will error if a permitted subclass does not declare a modifier.