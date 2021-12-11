package homework.hw05.tasks;

public class Car {
    private String name;
    private int yearOfProduction;
    private double engineCapacity;

    public Car() {
        this.name = "";
        this.yearOfProduction = 0;
        this.engineCapacity = 0;
    }

    public Car(String name , int yearOfProduction, double engineCapacity) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return name +
                " ["+
                "Year of production = " + yearOfProduction +
                ", Engine capacity = " + engineCapacity +
                ']';
    }
}
