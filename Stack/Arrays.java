package Stack;

class Stack {
    int[] stack;
    int top = -1;

    Stack() {
        stack = new int[5];
    }

    void push(int data) {
        if (top < stack.length-1) {
            top++;
            stack[top] = data;
//            System.out.println("top = " + top);
        }
        else {
            System.out.println("overflow");
        }
    }

    void pop() {
        if (top > -1) {
            top--;
        }
        else {
            System.out.println("underflow");
        }
    }

    void print() {
        int iterator;
        for (iterator = 0; iterator <= top; iterator++) {
            System.out.print(stack[iterator] + " ");
        }
        if (iterator == 0) {
            System.out.println("empty");
        }
    }
}

public class Arrays {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(5);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.print();
    }
}
