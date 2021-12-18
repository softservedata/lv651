package HW07.HomeWork2;

public class Motorcycle extends GroundVehicle {
    private int MaxSpeed;

    public Motorcycle(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("The Motorcycle is driving.");
    }
}
