package Collections.List;

import java.util.Iterator;
import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(null);

        Iterator iterator = stack.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
