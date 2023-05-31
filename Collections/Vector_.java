package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add("11");

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
