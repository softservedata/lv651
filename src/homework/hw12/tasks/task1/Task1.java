package homework.hw12.tasks.task1;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new ThreadOne());
        Thread t2 = new Thread(new ThreadTwo());
        Thread t3 = new Thread(new ThreadThree());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}
