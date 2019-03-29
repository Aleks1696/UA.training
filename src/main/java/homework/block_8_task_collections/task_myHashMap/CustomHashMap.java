package homework.block_8_task_collections.task_myHashMap;

import homework.block_6_task_registrationForm.app.exceptions.WrongInputDataException;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CustomHashMap<K, V> implements CustomMap<K, V> {
    private static final int INITIAL_SIZE = 16;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;

    private Node<K, V>[] table;
    private int size;
    private double loadFactor;
    private int threshold;

    @SuppressWarnings({"rawtypes", "unchecked"})
    public CustomHashMap() {
        table = (Node<K, V>[]) new Node[INITIAL_SIZE];
        loadFactor = DEFAULT_LOAD_FACTOR;
        threshold = (int) (INITIAL_SIZE * loadFactor);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public CustomHashMap(int size, double loadFactor) throws WrongInputDataException {
        checkNumber(size);
        checkNumber(loadFactor);
        table = (Node<K, V>[]) new Node[size];
        this.loadFactor = loadFactor;
        threshold = (int) (size * loadFactor);
    }

    public CustomHashMap(double loadFactor) throws WrongInputDataException {
        checkNumber(loadFactor);
        this.loadFactor = loadFactor;
        threshold = (int) (INITIAL_SIZE * loadFactor);
    }

    private void checkNumber(double number) throws WrongInputDataException {
        if (number < 0) {
            throw new WrongInputDataException("Wrong input number: ", String.valueOf(number));
        }
    }

    private class Node<K, V> {
        K key;
        V value;
        int hash;
        List<Node<K, V>> nodes;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            nodes = new LinkedList<>();
        }

        public int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }
    }

    public boolean put(final K key, final V value) {
        if (size == threshold) {
            expendArray();              //TODO continue logic
        }
        Node<K, V> newNode = new Node<>(key, value);
        int index = indexFor(hash(newNode));
        if (table[index] == null) {
            return putNode(index, newNode);
        }
        List<Node<K, V>> nodesFromBucket = table[index].nodes;
        for (Node<K, V> node : nodesFromBucket) {
            if (updateValue(node, newNode)) {
                return true;
            }
        }
        return processCollision(nodesFromBucket, newNode);
    }

    private boolean putNode(int index, Node<K, V> newNode) {
        table[index] = new Node<>(null, null);
        table[index].nodes.add(newNode);
        size++;
        return true;
    }

    private boolean updateValue(Node<K, V> nodeFromBucket, Node<K, V> newNode) {
        if (nodeFromBucket.key.equals(newNode.key)) {
            nodeFromBucket.value = newNode.value;
            return true;
        } else {
            return false;
        }
    }

    private boolean processCollision(List<Node<K, V>> nodes, Node<K, V> newNode) {
        nodes.add(newNode);
        return true;
    }

    private void processNotEmptyBucket(int index, Node<K, V> newNode) {
        Node<K, V> node = table[index];

    }

    private void expendArray() {

    }

    public boolean remove(K key) {
        return false;
    }

    public int size() {
        return 0;
    }

    public V get(K key) {
        return null;
    }

    public boolean contains(V value) {
        return false;
    }

    private int hash(Node<K, V> node) {
        return node.hashCode();
    }

    private int indexFor(int hash) {
        return hash & (table.length - 1);
    }
}
