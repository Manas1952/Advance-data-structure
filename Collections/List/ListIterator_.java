package Collections.List;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        ListIterator listIterator = arrayList.listIterator(1);

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex() + ": " + listIterator.previous());
        }
    }
}
