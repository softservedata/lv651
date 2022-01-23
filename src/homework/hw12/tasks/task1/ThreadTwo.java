package homework.hw12.tasks.task1;

public class ThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) System.out.println("ThreadTwo.run()");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
