package homework.block_8_task_collections.task_myHashMap;

public interface CustomMap<K, V> {
    boolean put(K key, V value);
    boolean remove(K key);
    int size();
    V get(K key);
    boolean contains(V value);
}
