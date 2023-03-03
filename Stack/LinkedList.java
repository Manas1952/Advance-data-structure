package Stack;

class Stack1 {
    java.util.LinkedList  linkedList;

    int length = 5, top = -1;

    Stack1() {
        linkedList = new java.util.LinkedList<>();
    }

    void push(int data) {
        if (top < length-1) {
            top++;
            linkedList.push(data);
        }
        else {
            System.out.println("overflow");
        }
    }

    void pop() {
        if (top > -1) {
            top--;
            linkedList.pop();
        }
        else {
            System.out.println("underflow");
        }
    }

    void print() {
        if (top == -1) {
            System.out.println("empty");
            return;
        }
        linkedList.forEach(element -> {
            System.out.print(element + " ");
        });
    }

}

public class LinkedList {
    public static void main(String[] args) {
        Stack1 stack = new Stack1();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.print();
    }
}
