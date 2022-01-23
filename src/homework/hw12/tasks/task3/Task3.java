package homework.hw12.tasks.task3;

public class Task3 {
    public static void main(String[] args) {
        Thread one = new Thread(new One());
        one.start();
    }
}
