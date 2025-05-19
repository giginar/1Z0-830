package section14_sealed_classes;


public class BasicExample {

}
sealed class Shape permits Circle, Rectangle {
}

final class Circle extends Shape {
    // OK: final class extending sealed base
}

non-sealed class Rectangle extends Shape {
    // OK: explicitly allows further extension
}

// 🔹 The permits clause explicitly defines which classes are allowed to extend Shape.
//  Visibility Rules:
//  All permitted subclasses must be in the same module, or same package (if not modular).
//  Each permitted subclass must explicitly declare whether it is:
//  final (no further subclassing)
//  sealed (continue sealed hierarchy)
//  non-sealed (completely open)