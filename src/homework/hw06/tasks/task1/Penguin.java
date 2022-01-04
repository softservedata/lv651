package homework.hw06.tasks.task1;

public class Penguin extends NonFlyingBird{

    public Penguin() {
        super(false, true);
    }

    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                " have feathers = " + feathers +
                ", lay eggs = " + layEggs +
                '}';
    }
}
