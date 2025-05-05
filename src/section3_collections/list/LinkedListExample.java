package section3_collections.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Kahvaltı");
        tasks.add("Uyan");
        tasks.add("Çalış");

        System.out.println("İlk Görev: " + tasks.getFirst());
        System.out.println("Son Görev: " + tasks.getLast());

        tasks.removeFirst();
        tasks.removeLast();

        tasks.push("Kitap oku");
        tasks.push("spor yap");
        System.out.println("Pop: " + tasks.pop());
    }
}
