package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(5);

        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.add(4);
        arrayDeque.offerLast(4);
        arrayDeque.offerLast(4);

        arrayDeque.removeFirst();
        arrayDeque.removeIf(integer -> integer == 3);
        Iterator iterator = arrayDeque.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
