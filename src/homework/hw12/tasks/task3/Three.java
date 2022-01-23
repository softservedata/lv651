package homework.hw12.tasks.task3;

public class Three implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Three started");
        for (int i = 0; i < 5; i++) System.out.println("Thread number three");
    }
}
