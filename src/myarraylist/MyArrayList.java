package myarraylist;

public class MyArrayList<T> implements List<T> {

    private Object[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() {
        array = new Object[capacity];
    }

    public void add(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem;
    }

    private void increaseBuffer() {
        capacity = (int) (1.5 * capacity);
        Object[] array2 = new Object[capacity];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public int getSize() {
        return size;
    }

    public int find(T keyItem) {
        for (int i = 0; i < size; i++) {
            if (array[i] == keyItem) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int index) {
        T removed = (T) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removed;
    }

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
}
