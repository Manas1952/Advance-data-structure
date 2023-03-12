package Synchronization;

class Table {
    synchronized void print(int value) {
        for (int iterator = 1; iterator <= 5; iterator++) {
            System.out.println(value * iterator);

            try {
                Thread.sleep(400);
            }
            catch (Exception exception) {
                System.out.println("handled");
            }
        }
    }
}

class MyThread1 extends Thread {
    Table table;

    MyThread1(Table table) {
        this.table = table;
    }

    public void run() {
        table.print(5);
    }
}

class MyThread2 extends Thread {
    Table table;

    MyThread2(Table table) {
        this.table = table;
    }

    public void run() {
        table.print(100);
    }
}

class Synchronization {
    public static void main(String[] args) {
        Table object = new Table();

        MyThread1 myThread1 = new MyThread1(object);
        MyThread2 myThread2 = new MyThread2(object);

        myThread1.start();
        myThread2.start();
    }
}
