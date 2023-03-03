package Lists;

public class DoublyLL {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
            head.prev = node;
            tail.next = null;
        }
        else {
            tail.next = node;
            node.prev = tail;
            node.next = null;
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
