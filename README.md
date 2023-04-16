# ADSAssignment2

## MyList Interface
This interface provides a list of methods to manipulate a list of objects of type T. The following methods are provided:

- ```int getSize()``` - Returns the number of elements in the list.
- ```void add(T newItem)``` - Adds a new item to the end of the list.
- ```T remove(int index)``` - Removes the item at the specified index from the list and returns it.
- ```T get(int index)``` - Returns the item at the specified index in the list.
- ```int find(T keyItem)``` - Searches for the index of the first occurrence of the specified item in the list. Returns -1 if not found.
- ```void reverse()``` - Reverses the order of the elements in the list.
- ```boolean contains(T o)``` - Returns true if the list contains the specified element.
- ```void add(T newItem, int index)``` - Adds the specified item at the specified position in the list.
- ```boolean remove(T item)``` - Removes the first occurrence of the specified item from the list. Returns true if the item was found and removed.
- ```void clear()``` - Removes all elements from the list.
- ```int indexOf(T o)``` - Returns the index of the first occurrence of the specified item in the list. Returns -1 if not found.
- ```int lastIndexOf(T o)``` - Returns the index of the last occurrence of the specified item in the list. Returns -1 if not found.
- ```void sort()``` - Sorts the elements in the list in ascending order.
- All methods operate on the list of objects of type T.

## Usage
To use the MyList interface, first implement it with your own class or use a pre-existing implementation. Once implemented, create a new instance of the class and use the provided methods to manipulate the list.
```
MyList<String> myArrayList = new MyArrayList<>();
myArrayList.add("Hello");
myArrayList.add("World");
String test = myArrayList.get(1);
```
