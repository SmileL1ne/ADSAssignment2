package myarraylist;

public class MyArrayList<T> implements List {

    private Object[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() {
        array = new Object[capacity];
    }
}
