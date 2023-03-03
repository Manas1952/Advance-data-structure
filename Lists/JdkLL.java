package Lists;

import java.util.LinkedList;

public class JdkLL {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.peek());
        System.out.println(linkedList.indexOf(new Integer(3)));
    }
}
