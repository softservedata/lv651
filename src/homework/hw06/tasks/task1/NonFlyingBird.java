package homework.hw06.tasks.task1;

public class NonFlyingBird extends Bird{

    public String fly() {
        return "can't fly";
    }

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}
