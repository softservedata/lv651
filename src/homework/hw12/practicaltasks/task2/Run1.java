package homework.hw12.practicaltasks.task2;

public class Run1 implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

    }
}
