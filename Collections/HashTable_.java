package Collections;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTable_ {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        hashtable.put(1, "a");
        hashtable.put(2, "b");
        hashtable.put(3, "c");

        Iterator iterator = hashtable.values().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (iterator.next().equals(hashtable.get(2))) {
                System.out.println("inside if");
                iterator.remove();
            }
        }
    }
}
