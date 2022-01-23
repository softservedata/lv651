package homework.hw12.tasks.task2;

public class Task2 {

    public static final Object monitor1 = new Object();
    public static final Object monitor2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                synchronized (monitor1) {
                    System.out.println("1");
                    Thread.yield();
                    synchronized (monitor2) {
                        System.out.println("2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (monitor2) {
                    System.out.println("3");
                    Thread.yield(); //deadlock
                    synchronized (monitor1) {
                        System.out.println("4");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
