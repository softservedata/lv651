package homework.hw06.tasks.task1;

public class Shallow extends FlyingBird{

    public Shallow() {
        super(true, true);
    }

    public Shallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Shallow{" +
                " have feathers = " + feathers +
                ", lay eggs = " + layEggs +
                '}';
    }
}
