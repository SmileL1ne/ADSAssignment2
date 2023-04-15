public class MyListsTest {

    public static void main(String[] args) {

        // MyArrayList TESTING

//        MyArrayMyList<Integer> arrayList = new MyArrayMyList<>();
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

        // MyDoublyLinkedList TESTING

        MyDoublyLinkedList<Integer> doublyLinkedList = new MyDoublyLinkedList<>();
        doublyLinkedList.add(1);
        doublyLinkedList.add(2);
        doublyLinkedList.add(3);
        doublyLinkedList.add(4);
        doublyLinkedList.add(5);
        System.out.println("Initial doubly linked list: ");
        for (int i = 0; i < doublyLinkedList.getSize(); i++) {
            System.out.print(doublyLinkedList.get(i) + " ");
        }

        System.out.println();
        System.out.println("Adding '8' to index 2: ");
        doublyLinkedList.add(8, 2);
        for (int i = 0; i < doublyLinkedList.getSize(); i++) {
            System.out.print(doublyLinkedList.get(i) + " ");
        }

        System.out.println();
        System.out.println("Item with index '5': ");
        System.out.println(doublyLinkedList.find(5));

        System.out.println("Removed item with index '2': ");
        System.out.println(doublyLinkedList.remove(2));
        for (int i = 0; i < doublyLinkedList.getSize(); i++) {
            System.out.print(doublyLinkedList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Reversed doubly linked list: ");
        doublyLinkedList.reverse();
        for (int i = 0; i < doublyLinkedList.getSize(); i++) {
            System.out.print(doublyLinkedList.get(i) + " ");
        }
    }
}
