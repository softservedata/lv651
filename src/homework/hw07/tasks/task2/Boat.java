package homework.hw07.tasks.task2;

public class Boat extends WaterVehicle{

    private int volume;

    public Boat() {
        this.volume = 0;
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        super.isSailing();
        System.out.println("Boat.isSailing()");
    }
}
