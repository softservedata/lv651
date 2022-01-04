package homework.hw06.tasks.task1;

public class Task1 {
    public static void main(String[] args) {
        Bird bird1 = new Eagle();
        Bird bird2 = new Shallow();
        Bird bird3 = new Penguin();
        Bird bird4 = new Chicken();
        Bird[] birds = {bird1, bird2, bird3, bird4};

        for(Bird bird : birds) {
            System.out.println(bird + " " + bird.fly());
        }
    }
}
