package homework.hw06.practicaltasks.task1;

public abstract class Car{

    private int maxSpeed;

    private int year;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car() {
        this.maxSpeed = 0;
        this.year = 0;
    }

    public Car(int maxSpeed, int year) {
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public abstract void run();

    public abstract void stop();

}
