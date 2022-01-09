package homework.hw07.tasks.task2;

public class Bus extends GroundVehicle{

    private String route;

    public Bus() {
        this.route = "";
    }

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Bus.drive()");
    }
}
