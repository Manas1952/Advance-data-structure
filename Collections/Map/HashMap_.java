package Collections.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMap_ {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(3, "c");
        map.put(2, "b");
        map.put(1, "a");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out:: println);
    }
}
