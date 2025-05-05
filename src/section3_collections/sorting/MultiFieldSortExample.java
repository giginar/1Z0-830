package section3_collections.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MultiFieldSortExample {
    static class Student {
        String name;
        int grade;
        int age;

        public Student(String name, int grade, int age) {
            this.name = name;
            this.grade = grade;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " - " + grade + " - " + age;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Ali", 90, 18),
                new Student("Ayşe", 90, 17),
                new Student("Veli", 85, 18)
        ));

        students.sort(Comparator
                .comparingInt((Student s)-> s.grade).reversed()
                .thenComparingInt(s -> s.age));

        System.out.println("Sorted by grade and then age:");
        students.forEach(System.out::println);

        // Note: thenComparing() enables multi-level sorting, useful for tie-breakers.
    }
}
