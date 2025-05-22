package section15_records;

public class Company {
    public record Employee(String name, String department) {}
    // 🔹 All nested records are implicitly static.
}

