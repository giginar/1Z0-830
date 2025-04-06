package collections.hashing;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashCodeContractViolation {
    static class Employee {
        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Only hashCode is implemented
        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return id + ": " + name;
        }
    }

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Ali"));
        employees.add(new Employee(1, "Ali")); // same hash, different references

        System.out.println("Set size: " + employees.size()); // 2 - equals not implemented!
        employees.forEach(System.out::println);
    }

    // ❗ Important: If hashCode() is implemented, you must also override equals() to maintain contract consistency.
}
