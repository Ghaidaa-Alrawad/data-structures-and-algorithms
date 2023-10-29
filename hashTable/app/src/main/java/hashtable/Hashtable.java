package hashTable.app.src.main.java.hashtable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hashtable<K, V> {

    private static final int DEFAULT_CAPACITY = 10; // i did write this line for setting a default capacity of the hashtable when no specific capacity is provided

    private List<LinkedList<KeyValuePair<K, V>>> table;
    private int capacity;

    public Hashtable() {
        this(DEFAULT_CAPACITY);
    }

    public Hashtable(int capacity) {
        this.capacity = capacity;
        this.table = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            table.add(new LinkedList<>());
        }
    }

    public void set(K key, V value) {
        int index = hash(key);
        LinkedList<KeyValuePair<K, V>> bucket = table.get(index);

        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }

        bucket.add(new KeyValuePair<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<KeyValuePair<K, V>> bucket = table.get(index);

        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }

        throw new RuntimeException("Key not found: " + key);
    }

    public boolean has(K key) {
        int index = hash(key);
        LinkedList<KeyValuePair<K, V>> bucket = table.get(index);

        for (KeyValuePair<K, V> pair : bucket) {
            if (pair.key.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public List<K> keys() {
        List<K> keys = new ArrayList<>();

        for (LinkedList<KeyValuePair<K, V>> bucket : table) {
            for (KeyValuePair<K, V> pair : bucket) {
                keys.add(pair.key);
            }
        }

        return keys;
    }

    private int hash(K key) {
        return key.hashCode() % capacity;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < capacity; i++) {
            LinkedList<KeyValuePair<K, V>> bucket = table.get(i);

            if (!bucket.isEmpty()) {
                result.append("Bucket ").append(i).append(": ");

                for (KeyValuePair<K, V> pair : bucket) {
                    result.append("(").append(pair.key).append(", ").append(pair.value).append(") ");
                }

                result.append("\n");
            }
        }

        return result.toString();
    }
}
