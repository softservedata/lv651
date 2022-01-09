package homework.hw07.tasks.task2;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane() {
        this.maxDistance = 0;
    }

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Plane.fly()");
    }

    @Override
    public void land() {
        super.land();
        System.out.println("Plane.land()");
    }
}
