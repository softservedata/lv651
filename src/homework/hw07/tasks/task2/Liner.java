package homework.hw07.tasks.task2;

public class Liner extends WaterVehicle{

    private int floors;

    public Liner() {
        this.floors = 0;
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        super.isSailing();
        System.out.println("Liner.isSailing()");
    }
}
