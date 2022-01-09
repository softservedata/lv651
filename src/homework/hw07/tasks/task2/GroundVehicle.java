package homework.hw07.tasks.task2;

public class GroundVehicle extends Passengers implements Vehicle{

    public GroundVehicle() {
    }

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public void drive() {
        System.out.println("GroundVehicle.drive()");
    }
}
