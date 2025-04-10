package generics.basic;

public class GenericPairExample {
    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }
    }

    public static void main(String[] args) {
        Pair<String, Integer> personAge = new Pair<>("Alice", 30);
        System.out.println(personAge.getKey() + " is " + personAge.getValue() + " years old");
    }

    // 🔹 Note: You can use multiple type parameters in generic classes (e.g., <K, V> in Map<K, V>).
}
