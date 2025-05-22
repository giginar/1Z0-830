package section15_records;

public record Temperature(double celsius) {
    public double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }
    // 🔹 Records can have additional methods, static or instance.
}

