package homework.block_8_task_collections.task_2_myArrayList;

import java.util.ArrayList;

public class MyArrayList<T> {
    private Object [] buffer;
    private int position;

    public MyArrayList() {
        buffer = new Object[10];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            buffer = new Object[capacity];
        }
    }

    public int size() {
        return position;
    }

    public int capacity() {
        return buffer.length;
    }

    public boolean add(T element) {
        if (!checkCapacity()) {
            buffer[position] = element;
            position++;
            return true;
        }
        extendArray();
        add(element);
        return true;
    }

    public boolean remove(int index) {
        Object[] temp = buffer;
        System.arraycopy(buffer, index + 1, buffer, index, buffer.length - index - 1);
        position--;
        return true;
    }

    public Object get(int index) {
        return buffer[index];
    }

    private boolean checkCapacity() {
        return ((position + 1) == buffer.length);
    }

    private void extendArray() {
        Object[] temp = buffer;
        buffer = new Object[(temp.length * 3) / 2 + 1];
        System.arraycopy(temp, 0, buffer, 0, temp.length);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyArrayList{");
        for (int i = 0; i < position; i++) {
            sb.append(buffer[i]);
            if ((i < position - 1)) {
                sb.append(", ");
            } else {
                sb.append("}");
            }
        }
        return sb.toString();
    }
}
