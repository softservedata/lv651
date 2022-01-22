package homework.hw12.practicaltasks.task2;

public class Task2 {

    public static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Run1());
        Thread t2 = new Thread(new Run2());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is Bohdan");
    }
}
