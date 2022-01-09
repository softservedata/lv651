package homework.hw07.tasks.task2;

public class Car extends GroundVehicle{

    private String model;

    public Car() {
        this.model = "";
    }

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Car.drive()");
    }
}
