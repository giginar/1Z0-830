package collections.hashing;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsAndHashCodeExample {
    static class Person {
        String name;
        int id;

        public Person(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Person)) return false;
            Person other = (Person) obj;
            return this.id == other.id && Objects.equals(this.name, other.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }

        @Override
        public String toString() {
            return name + " #" + id;
        }
    }
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        people.add(new Person("Ali", 1));
        people.add(new Person("Can", 2));
        people.add(new Person("Ali", 1)); // Same content → duplicate in logic

        System.out.println("Set size: " + people.size()); // 2
        people.forEach(System.out::println);
    }

    // Note: If equals() and hashCode() are not overridden, the default behavior is identity-based,
    // which can break logical set behavior.
}
