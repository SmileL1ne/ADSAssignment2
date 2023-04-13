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
}
