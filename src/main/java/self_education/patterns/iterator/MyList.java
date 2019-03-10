package self_education.patterns.iterator;

public class MyList implements Container {
    Object[] buffer = {1, 2, 3, 4, 5, 6, 7};

    public Iterator iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator {
        private int index = 0;

        public Object next() {
            if (buffer.length == index) {
                throw new ArrayIndexOutOfBoundsException("");
            } else {
                return buffer[index++];
            }
        }

        public boolean hasNext() {
            return index < buffer.length;
        }
    }
}
