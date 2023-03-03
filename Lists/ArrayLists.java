package Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("d");

        list.add(2, "c");

        list.set(0, "A");

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("e");
        list1.add("f");
        list1.add("g");

        list.addAll(list1);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        list1.remove(0);

        list.forEach(element -> {
            System.out.print(element + " ");
        });
        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);

        list2.remove(new Integer(3));

        list2.forEach(element -> {
            System.out.print(element + " ");
        });
    }
}
