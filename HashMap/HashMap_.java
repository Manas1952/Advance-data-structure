package HashMap;

import java.util.*;

public class HashMap_ {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");

        System.out.println(hashMap);

        System.out.println(hashMap.keySet());

        Set set = hashMap.entrySet();

        System.out.println(set);

        TreeMap hashMap1= new TreeMap();

        hashMap1.put("a", 11);
        hashMap1.put("aa", 12);
        hashMap1.put("aaa", 13);
       // hashMap1.put(1, "aaa");
      //  hashMap1.put(1, "aa");

        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();

        ListIterator listIterator = arrayList.listIterator();

        System.out.println(hashMap1);
    }
}
