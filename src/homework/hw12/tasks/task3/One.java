package homework.hw12.tasks.task3;

public class One implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread One started");
        Thread two = new Thread(new Two());
        two.start();
    }
}
