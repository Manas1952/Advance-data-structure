package Lists;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(1);

        vector.add(1);
        vector.add(2);
        vector.add(3);

        vector.addElement(4);
        vector.add(5);

        vector.forEach(element -> {
            System.out.print(element + " ");
        });
        System.out.println();

        System.out.println(vector.size());
        System.out.println(vector.capacity());
    }
}
