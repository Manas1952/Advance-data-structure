package Collections;

import java.util.ArrayList;

public class Collection_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("1");
        arrayList.add(1);

        System.out.println(arrayList.get(0).getClass());
        System.out.println(arrayList.get(1).getClass());
    }
}
