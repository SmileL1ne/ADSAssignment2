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

        // MyLinkedList TESTING

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        System.out.println("Initial linked list: ");
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }

        System.out.println();
        System.out.println("Find index of element '4': ");
        System.out.println(linkedList.find(4));

        System.out.println("Remove element with index '3': ");
        System.out.println(linkedList.remove(3));
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }

        System.out.println();
        System.out.println("Reversed linked list: ");
        linkedList.reverse();
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
    }
}
