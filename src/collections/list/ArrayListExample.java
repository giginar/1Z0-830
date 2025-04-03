package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Ekleme
        names.add("Ali");
        names.add("Veli");
        names.add("Ayşe");

        // Araya ekleme
        names.add(1, "Fatma");

        // Erişim
        System.out.println("İkinci eleman: " + names.get(1));

        // Güncelleme
        names.set(2, "Zeynep");

        // Silme
        names.remove("Ali");
        names.remove(1); // index'e göre

        // Arama
        System.out.println("Listede Ayşe var mı? " + names.contains("Ayşe"));

        // Dönüştürme
        String[] array = names.toArray(new String[0]);

        // Döngü
        for (String name : names) {
            System.out.println(name);
        }

        // Listeyi boşaltma
        names.clear();

        // Liste boş mu?
        System.out.println("Liste boş mu? " + names.isEmpty());
    }
}
