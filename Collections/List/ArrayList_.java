package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_ {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("1");
        arrayList.add(1, "2");
        arrayList.add("3");

        List arrayList2 = Collections.unmodifiableList(arrayList);

        arrayList2.add(1);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add(0, "3");
        arrayList1.add(1, "4");

        arrayList.addAll(arrayList1);

        arrayList.addAll(0, arrayList1);

        // will remove all matching elements
        arrayList.removeAll(arrayList1);

        Iterator iterator = arrayList.iterator();

        iterator.forEachRemaining(element -> {
            System.out.println(element);
        });

    }
}
