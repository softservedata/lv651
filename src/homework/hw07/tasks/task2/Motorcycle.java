package homework.hw07.tasks.task2;

public class Motorcycle extends GroundVehicle{

    private int maxSpeed;

    public Motorcycle() {
        this.maxSpeed = 0;
    }

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Motorcycle.drive()");
    }
}
