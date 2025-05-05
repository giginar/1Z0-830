package section3_collections.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    static class Employee {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Zeynep", 30),
                new Employee("Ahmet", 25),
                new Employee("Mehmet", 35)
        ));

        employees.sort(Comparator.comparing(employee -> employee.name));

        System.out.println("Sorted by name:");
        employees.forEach(System.out::println);

        employees.sort(Comparator.comparingInt((Employee e) -> e.age).reversed());

        System.out.println("Sorted by age(descending):");
        employees.forEach(System.out::println);
    }
}
