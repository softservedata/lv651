package homework.hw06.tasks.task1;

public abstract class Bird {

    boolean feathers;

    boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract String fly();

}
