package HashTables;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapSorting {
    public static void main(String[] args) {
        try {
            HashMap<Integer, String> hashMap = new HashMap<>();

            hashMap.put(3, "c");
            hashMap.put(2, "b");
            hashMap.put(1, "a");
            hashMap.put(22, "a");
            hashMap.put(33, "a");

            Iterator iterator1 = hashMap.keySet().iterator();

            while (iterator1.hasNext()) {
                int key = (int) iterator1.next();
                System.out.println("key: " + key + ", " + hashMap.get(key));
            }

            TreeMap<Integer, String> treeMap = new TreeMap<>();
        }
        catch (Exception exception) {
            System.out.println("Excetion: " + exception);
        }
    }
}
