package homework.hw07.tasks.task2;

public class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle() {
    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public void isSailing() {
        System.out.println("WaterVehicle.isSailing()");
    }
}
