package Queue;

public class Circular {
    int[] queue;
    int front = -1, rear = -1;

    Circular() {
        queue = new int[5];
    }

    void enQueue(int data) {
        if (front == -1) {
            rear = (rear+1) % 5;
            queue[rear] = data;

            front++;
        }
        else if (front == (rear + 1) % 5) {
            System.out.println("overflow");
        }
        else {
            rear = (rear+1) % 5;
            queue[rear] = data;
        }
        System.out.println("front: " + front + ", rear: " + rear);
    }

    void deQueue() {
        if (front == -1) {
            System.out.println("underflow");
        }
        else if (front == rear){
            front = rear = -1;
        }
        else {
            front = (front+1) % 5;
        }
        System.out.println("front: " + front + ", rear: " + rear);
    }

    void display() {
        if (front == -1) {
            System.out.println("empty");
            return;
        } else if (front == rear) {
            System.out.println(queue[front]);
        }
        else {
            int temp = front;
            while (temp != rear) {
                System.out.println(queue[temp] + " " + temp);
                temp = (temp+1) % 5;
            }
            System.out.println(queue[temp] + " " + temp);
        }

    }

    public static void main(String[] args) {
        Circular queue = new Circular();

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        System.out.println();

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.enQueue(1);
        queue.enQueue(1);
        queue.enQueue(1);

        queue.display();
    }
}
