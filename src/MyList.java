public interface MyList<T>{

    int getSize();

    void add(T newItem);
    T remove(int index);

    T get(int index);
    int find(T keyItem);
    void reverse();

    void add(T newItem, int index);
        boolean contains(T o);
    boolean remove(T item);

    void clear();

    int indexOf(T o);
    int lastIndexOf(T o);
    void sort();
}
