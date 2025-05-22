package section15_records;

public record Person(String name, int age) {}


// Equivalent to writing:

final class Person2 {
    private final String name;
    private final int age;

    public Person2(String name, int age) { this.name = name; this.age = age; }
    public String name() { return name; }
    public int age() { return age; }

    @Override public boolean equals(Object o) { /* generated */
        return false;
    }
    @Override public int hashCode() { /* generated */
        return 0;
    }
    @Override public String toString() { return "Person[name=" + name + ", age=" + age + "]"; }
}