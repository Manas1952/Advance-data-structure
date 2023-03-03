package Lists;

public class Circular {

    Node head = null;
    Node tail = null;

    class Node {
        int data;

        Node(int data) {
            this.data = data;
        }

        Node next;
    }

    void push (int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        }
        else {
            tail.next = node;
            tail = node;
            node.next = head;
        }
    }

    void pop() {
        Node temp = head;
        if (temp.next == tail) {
            temp.next = head;
            tail.next = null;
        }
    }

    void print() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("null");
    }

    public static void main(String[] args) {

        Circular circular = new Circular();

        circular.push(1);
        circular.push(2);
        circular.push(3);

        circular.pop();

        circular.print();
    }
}
