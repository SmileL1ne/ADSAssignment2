public class MyArrayList<T> implements MyList<T> {

    private Object[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() {
        array = new Object[capacity];
    }

    @Override
    public void add(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem;
    }

    @Override
    public void add(T newItem, int index) {
        if (index > capacity || index < 0) throw new IndexOutOfBoundsException();
        if (size == capacity) {
            increaseBuffer();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = newItem;
        size++;
    }

    private void increaseBuffer() {
        capacity = (int) (1.5 * capacity);
        Object[] array2 = new Object[capacity];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int find(T keyItem) {
        for (int i = 0; i < size; i++) {
            if (array[i] == keyItem) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T remove(int index) {
        T removed = (T) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removed;
    }

    @Override
    public void reverse() {
        int r = size - 1;
        for (int i = 0; i < size; i++) {
            Object temp;
            temp = array[i];
            array[i] = array[r];
            array[r] = temp;
            if (i == r || i > r) break;
            r--;
        }
    }

    @Override
    public boolean contains(T o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public boolean remove(T item) {
        for (int i = 0; i < size; i++) {
            if (array[i] == item) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        array = new Object[size];
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == o) return i;
        }
        return -1;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) array[j]).compareTo((T) array[j + 1]) > 0) {
                    T temp = (T) array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

}
