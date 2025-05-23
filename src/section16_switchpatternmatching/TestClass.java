package section16_switchpatternmatching;

public class TestClass {
    Object obj = new Person("Alice", new Address("Berlin"));

    String city = switch (obj) {
        case Person(String name, Address(String city)) -> city;
        default -> "Unknown";
    };
    // ✅ You can nest patterns inside each other, useful for hierarchical models.
}

record Person(String name, Address address) {}
record Address(String city) {}



