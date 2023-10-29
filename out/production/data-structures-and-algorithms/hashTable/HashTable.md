# Hash Table implementation

Implement a simple hashtable class with set, get, has, keys, and hash methods. The hashtable should handle collisions by using separate chaining (each bucket contains a linked list of key-value pairs).

---

## Whiteboard

---

## Approach & Efficiency

#### Approach:

- The `Hashtable` class uses an underlying list of linked lists to represent the buckets.
- The `set` method hashes the key, finds the appropriate bucket, and handles collisions by appending to the linked list.
- The `get` method retrieves the value associated with a key from the appropriate bucket.
- The `has` method checks whether a key exists in the hashtable.
- The `keys` method returns a list of all unique keys in the hashtable.
- The `hash` method determines the index of the bucket for a given key.

#### Efficiency:

- The time complexity for the `set`, `get`, and `has` methods is O(1) on average, assuming a good hash function and even distribution.
- The `keys` method has a time complexity of O(n), where n is the total number of key-value pairs in the hashtable.
- The space complexity is O(n + m), where n is the number of key-value pairs and m is the capacity of the hashtable.

---

## Solution


```java
public class KeyValuePair<K, V> {
    K key;
    V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValuePair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
```

```java
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
```