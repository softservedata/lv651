package homework.hw12.practicaltasks.task1;

public class Task1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

    }
}
