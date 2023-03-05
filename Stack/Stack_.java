package Stack;

import java.util.Iterator;
import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.forEach(element -> {
            System.out.print(element + " ");
        });
    }
}
