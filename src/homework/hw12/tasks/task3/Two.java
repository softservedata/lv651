package homework.hw12.tasks.task3;

public class Two implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Two started");
        for (int i = 0; i < 3; i++) System.out.println("Thread number two");
        Thread three = new Thread(new Three());
        three.start();
    }
}
