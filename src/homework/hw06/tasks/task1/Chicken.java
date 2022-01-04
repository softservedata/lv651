package homework.hw06.tasks.task1;

public class Chicken extends NonFlyingBird{

    public Chicken() {
        super(true, true);
    }

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Chicken{" +
                " have feathers = " + feathers +
                ", lay eggs = " + layEggs +
                '}';
    }
}
