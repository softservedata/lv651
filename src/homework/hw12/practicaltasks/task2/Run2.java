package homework.hw12.practicaltasks.task2;

public class Run2 implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Peace in the peace");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

    }
}
