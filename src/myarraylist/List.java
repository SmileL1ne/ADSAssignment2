package myarraylist;

public interface List<T> {

    void add(T newItem);

    T get(int index);

    int getSize();

    int find(T keyItem);

    T remove(int index);

    void reverse();
}
