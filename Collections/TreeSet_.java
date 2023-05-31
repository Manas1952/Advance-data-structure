package Collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        Set syncSet = Collections.synchronizedSet(treeSet);

    }
}
