
public class MyLinkedList<T> implements MyList<T>{

    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {
    }

    public MyLinkedList(MyNode<T> newNode) {
        head = newNode;
    }

    private static class MyNode<E> {
        E data;
        MyNode<E> next;
        MyNode(E data) {
            this.data = data;
        }
    }

    @Override
    public void add(T newItem) {
        MyNode<T> newNode = new MyNode<>(newItem);
        if (head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int find(T keyItem) {
        return 0;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public void reverse() {

    }
}
