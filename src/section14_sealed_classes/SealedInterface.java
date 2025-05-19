package section14_sealed_classes;

public class SealedInterface {
}

sealed interface Animal permits Dog, Cat {}

final class Dog implements Animal {}
non-sealed class Cat implements Animal {}

// 🔸 Interfaces can also be sealed and use the same rules.

