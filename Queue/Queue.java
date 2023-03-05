package Queue;

public class Queue {
    int[] queue;
    int rear = -1;

    Queue() {
        queue = new int[5];
    }

    void add(int data) {
        if (rear < queue.length - 1) {
            rear++;
            queue[rear] = data;
//            System.out.println("front: " + front + ", rear: " + rear);
        }
        else {
            System.out.println("overflow");
        }
    }

    void poll() {
        if (rear == 0) {
            rear = -1;
        }
        else if (rear == -1) {
            System.out.println("underflow");
        }
        else {
            for (int iterator = 1; iterator <= rear; iterator++) {
                queue[iterator-1] = queue[iterator];
            } 
            rear--;
        }
    }

    void display() {
        int temp = 0;
        while (temp <= rear) {
            System.out.print(queue[temp++] + " ");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        queue.poll();
        queue.poll();
        queue.poll();

        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);

        queue.display();
    }
}
