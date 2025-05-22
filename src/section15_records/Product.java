package section15_records;

public record Product(String name, double price) {
    public Product {
        if (price < 0) throw new IllegalArgumentException("Price can't be negative");
    }

    // 🔹 Compact constructors don’t repeat the field list, just the body logic.
}

