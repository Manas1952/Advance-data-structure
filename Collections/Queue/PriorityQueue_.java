package Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueue_ {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(5);

        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(-4);
        priorityQueue.add(-4);
        priorityQueue.add(-4);

        // no null allowed
//        priorityQueue.add(null);



        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
