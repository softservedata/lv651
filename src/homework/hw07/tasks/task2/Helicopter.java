package homework.hw07.tasks.task2;

public class Helicopter extends FlyingVehicle{

    private int weight;
    private int maxHeight;

    public Helicopter() {
        this.weight = 0;
        this.maxHeight = 0;
    }

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Helicopter.fly()");
    }

    @Override
    public void land() {
        super.land();
        System.out.println("Helicopter.land()");
    }
}
