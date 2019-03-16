package homework.block_8_task_collections.task_myLinkedList;

import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Linked<T> {
    private int size;
    private Node first;
    private Node last;

    @Override
    public void addFirst(T element) {
        Node temp = first;
        Node newNode = new Node(null, element, temp);
        first = newNode;
        if (temp == null) {
            last = newNode;
        } else {
            temp.prev = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        Node temp = last;
        Node newNode = new Node(temp, element, null);
        last = newNode;
        if (temp == null) {
            first = newNode;
        } else {
            temp.next = newNode;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node target = first;
        for (int i = 0; i < index; i++) {
            target = getNextNode(target);
        }
        return target.element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("List size is: " + size);
        }
    }

    @Override
    public T getFirst() {
        checkIfExist(first);
        return first.element;
    }

    @Override
    public T getLast() {
        checkIfExist(last);
        return last.element;
    }

    private void checkIfExist(Node node) {
        if (node == null) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean remove(T element) {
        Node current = first;
        while (current != null) {
            if (current.element.equals(element)) {
                relink(current);
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    private void relink(Node current) {
        Node prev = current.prev;
        Node next = current.next;
        if (prev != null) {
            prev.next = next;
        } else {
            first = next;
        }
        if (next != null) {
            next.prev = prev;
        } else {
            last = prev;
        }
    }

    private Node getNextNode(Node node) {
        return node.next;
    }

    private class Node {
        Node prev;
        T element;
        Node next;

        Node(Node prev, T element, Node next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public String toString() {
        Node current = first;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (current != null) {
            sb.append(current.element);
            if (current.next != null)
                sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
