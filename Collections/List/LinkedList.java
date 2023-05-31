package Collections.List;

import java.util.Iterator;

public class LinkedList {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];

        array[0] = 1;

        java.util.LinkedList linkedList = new java.util.LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Iterator iterator = linkedList.descendingIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
