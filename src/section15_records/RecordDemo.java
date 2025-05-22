package section15_records;

public record RecordDemo() {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println(p.name());  // Alice
        System.out.println(p.age());   // 30
        System.out.println(p);         // Person[name=Alice, age=30]
    }
}
