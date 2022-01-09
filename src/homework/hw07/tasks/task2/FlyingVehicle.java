package homework.hw07.tasks.task2;

public class FlyingVehicle extends Passengers implements Vehicle{

    public FlyingVehicle() {
    }

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public void fly() {
        System.out.println("FlyingVehicle.fly()");
    }

    public void land() {
        System.out.println("FlyingVehicle.land()");
    }
}
