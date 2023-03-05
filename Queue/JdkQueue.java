package Queue;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JdkQueue {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();

        concurrentLinkedQueue.add(1);
        concurrentLinkedQueue.add(2);
        concurrentLinkedQueue.add(3);
        concurrentLinkedQueue.add(null);

        concurrentLinkedQueue.removeIf(element -> {
            return element == 3;
        });

        concurrentLinkedQueue.forEach(element -> {
            System.out.println(element);
        });
    }
}
