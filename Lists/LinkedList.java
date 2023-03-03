package Lists;

public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.display();
    }
}
