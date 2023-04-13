import myarraylist.MyArrayList;

public class MyArrayListTest {

    public static void main(String[] args) {

        // MyArrayList TESTING

        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("Initial arraylist: ");
        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println();
        System.out.println("Find index of '4': ");
        System.out.println(arrayList.find(4));

        System.out.println("Remove element with index 3: ");
        System.out.println(arrayList.remove(3));
        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
