import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

class Main extends Thread {
    static HashMap concurrentHashMap = new HashMap();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException interruptedException) {
            System.out.println("handled");
        }
        System.out.println("Child thread updating map");
        concurrentHashMap.put(3, "c");
    }

    public static void main(String[] args) throws InterruptedException {
        concurrentHashMap.put(1, "a");
        concurrentHashMap.put(2, "b");

        Main object = new Main();
        object.run();

        Iterator iterator= concurrentHashMap.keySet().iterator();

        while (iterator.hasNext()) {
            int key = (int) iterator.next();

            System.out.println("Main thread is iterating with current entry: " + key + " -> " + concurrentHashMap.get(key));

            Thread.sleep(4000);
        }
    }
}