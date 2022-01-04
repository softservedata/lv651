package homework.hw06.tasks.task1;

public class FlyingBird extends Bird{

    public String fly() {
        return "can fly";
    }

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}
