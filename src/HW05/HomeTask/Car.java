package HW05.HomeTask;

public class Car {
    private CarProducer carProducer;
    private CarType carType;
    private int year;
    private double capacity;

    public Car(CarProducer carProducer, CarType carType, int year, double capacity) {
        this.carProducer = carProducer;
        this.carType = carType;
        this.year = year;
        this.capacity = capacity;
    }

    public CarProducer getCarProducer() {
        return carProducer;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getYear() {
        return year;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "" + carProducer +
                " (" + carType +
                ") ," + year +
                ", v" + capacity;
    }

}
