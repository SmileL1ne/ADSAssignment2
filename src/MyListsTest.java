public class MyListsTest {

    public static void main(String[] args) {

        // MyArrayList TESTING

//        MyList<Integer> arrayList = new MyArrayMyList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        System.out.println("Initial arraylist: ");
//        for (int i = 0; i < arrayList.getSize(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }
//
//        System.out.println();
//        System.out.println("Find index of '4': ");
//        System.out.println(arrayList.find(4));
//
//        System.out.println("Remove element with index 3: ");
//        System.out.println(arrayList.remove(3));
//        for (int i = 0; i < arrayList.getSize(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }
//
//        System.out.println();
//        System.out.println("Reversed arraylist: ");
//        arrayList.reverse();
//        for (int i = 0; i < arrayList.getSize(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }

//        System.out.println();
//        System.out.println("Add item '9' at index 2: ");
//        arrayList.add(9, 2);
//        for (int i = 0; i < arrayList.getSize(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }
//
//        System.out.println();
//        System.out.println("Contains item '9': ");
//        System.out.println(arrayList.contains(9));
//        System.out.println("Contains item 23: ");
//        System.out.println(arrayList.contains(23));

//        System.out.println("Remove element '9'");
//        Integer test = 9;
//        System.out.println(arrayList.remove(test));
//        for (int i = 0; i < arrayList.getSize(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }

//        System.out.println();
//        System.out.println("Clear an array: ");
//        arrayList.clear();
//        for (int i = 0; i < arrayList.getSize(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }

//        System.out.println();
//        System.out.println("Index of element '3': ");
//        System.out.println(arrayList.indexOf(3));
//
//        System.out.println("Index of last occurrence of '3': ");
//        arrayList.add(5);
//        arrayList.add(5);
//        for (int i = 0; i < arrayList.getSize(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }
//        System.out.println();
//        System.out.println(arrayList.lastIndexOf(5));
//
//        MyArrayMyList<Integer> intArray = new MyArrayMyList<>();
//        intArray.add(8);
//        intArray.add(4);
//        intArray.add(2);
//        intArray.add(15);
//        System.out.println("New array: ");
//        for (int i = 0; i < intArray.getSize(); i++) {
//            System.out.print(intArray.get(i) + " ");
//        }
//        System.out.println();
//        System.out.println("Sorted array: ");
//        intArray.sort();
//        for (int i = 0; i < intArray.getSize(); i++) {
//            System.out.print(intArray.get(i) + " ");
//        }

        // MyDoublyLinkedList TESTING

        MyList<Integer> myDoublyLinkedList = new MyDoublyLinkedList<>();
        myDoublyLinkedList.add(1);
        myDoublyLinkedList.add(2);
        myDoublyLinkedList.add(3);
        myDoublyLinkedList.add(4);
        myDoublyLinkedList.add(5);
        System.out.println("Initial doubly linked list: ");
        for (int i = 0; i < myDoublyLinkedList.getSize(); i++) {
            System.out.print(myDoublyLinkedList.get(i) + " ");
        }

//        System.out.println();
//        System.out.println("Adding '8' to index 2: ");
//        myDoublyLinkedList.add(8, 2);
//        for (int i = 0; i < myDoublyLinkedList.getSize(); i++) {
//            System.out.print(myDoublyLinkedList.get(i) + " ");
//        }

//        System.out.println();
//        System.out.println("Item with index '5': ");
//        System.out.println(myDoublyLinkedList.find(5));
//
//        System.out.println("Removed item with index '2': ");
//        System.out.println(myDoublyLinkedList.remove(2));
//        for (int i = 0; i < myDoublyLinkedList.getSize(); i++) {
//            System.out.print(myDoublyLinkedList.get(i) + " ");
//        }
//        System.out.println();
//        System.out.println("Reversed doubly linked list: ");
//        myDoublyLinkedList.reverse();
//        for (int i = 0; i < myDoublyLinkedList.getSize(); i++) {
//            System.out.print(myDoublyLinkedList.get(i) + " ");
//        }

        System.out.println();
//        System.out.println("Contains '4': ");
//        System.out.println(myDoublyLinkedList.contains(4));
//        System.out.println("Contains '10': ");
//        System.out.println(myDoublyLinkedList.contains(10));

//        System.out.println("Remove element '3': ");
//        Integer test = 3;
//        System.out.println(myDoublyLinkedList.remove(test));
//        for (int i = 0; i < myDoublyLinkedList.getSize(); i++) {
//            System.out.print(myDoublyLinkedList.get(i) + " ");
//        }

//        System.out.println("Clear a doubly linked list: ");
//        myDoublyLinkedList.clear();
//        for (int i = 0; i < myDoublyLinkedList.getSize(); i++) {
//            System.out.print(myDoublyLinkedList.get(i) + " ");
//        }

        System.out.println("Index of element '4': ");
        System.out.println(myDoublyLinkedList.indexOf(4));

        System.out.println("Last index of element '4': ");
        System.out.println(myDoublyLinkedList.lastIndexOf(4));


    }
}
