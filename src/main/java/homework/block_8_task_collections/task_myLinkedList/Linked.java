package homework.block_8_task_collections.task_myLinkedList;

public interface Linked<T> {
    void addFirst(T element);
    void addLast(T element);
    int size();
    T get(int index);
    T getFirst();
    T getLast();
    boolean remove(T element);
}
