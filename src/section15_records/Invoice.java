package section15_records;

interface Printable {
    void print();
}

public record Invoice(int id, double amount) implements Printable {
    @Override
    public void print() {
        System.out.println("Invoice #" + id + ": $" + amount);
    }
    // 🔹 Records can implement interfaces like any class.
}

