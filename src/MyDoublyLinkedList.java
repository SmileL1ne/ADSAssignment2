
public class MyDoublyLinkedList<T> implements MyList<T> {

    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyDoublyLinkedList() {
    }

    public MyDoublyLinkedList(MyNode<T> newNode) {
        head = newNode;
    }

    private static class MyNode<E> {
        E data;
        MyNode<E> next;
        MyNode<E> prev;

        MyNode(E data) {
            this.data = data;
        }
    }

    @Override
    public void add(T newItem) {
        MyNode<T> newNode = new MyNode<>(newItem);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        tail.next = null;
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
        MyNode<T> current = head;
        for (int i = 0; i < size; i++) {
            if (current.data == keyItem) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public T remove(int index) {
        if (head == null) {
            return null;
        }
        MyNode<T> current = head;
        if (index == 0) {
            T removed = current.data;
            head = current.next;
            size--;
            return removed;
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        T removed = current.data;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        size--;
        return removed;
    }

    @Override
    public void reverse() {
        MyNode<T> current = head;
        MyNode<T> temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    @Override
    public void add(T newItem, int index) {
        MyNode<T> current = head;
        MyNode<T> newNode = new MyNode<>(newItem);
        if (index == 0) {
            head.prev = newNode;
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
            size++;
            return;
        }
        int halfLen = size / 2;
        if (index <= halfLen) {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i >= index - 1; i--) {
                current = current.prev;
            }
        }

        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
        newNode.prev = current;
        size++;
    }

    @Override
    public boolean contains(T o) {
        MyNode<T> current = head;
        while (current != null) {
            if (current.data == o) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean remove(T item) {
        MyNode<T> current = head;
        int index = 0;
        while (current.next != null) {
            if (current.data == item) {
                remove(index);
                return true;
            }
            current = current.next;
            index++;
        }
        return false;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int indexOf(T o) {
        MyNode<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data == o) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        MyNode<T> current = tail;
        int index = size - 1;
        while (current.prev != null) {
            if (current.data == o) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public void sort() {
        MyNode<T> current = head;
        MyNode<T> wholeList = head;
        while(wholeList != null) {
            while (current.next != null) {
                if (((Comparable<T>) current.data).compareTo(current.next.data) > 0) {
                    T temp = current.next.data;
                    current.next.data = current.data;
                    current.data = temp;
                }
                current = current.next;
            }
            current = head;
            wholeList = wholeList.next;
        }
    }

}
