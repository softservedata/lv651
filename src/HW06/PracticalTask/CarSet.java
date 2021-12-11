package HW06.PracticalTask;

import java.util.Arrays;
import java.util.Comparator;

public class CarSet {
    // We initialize static variables inside a static block.
    static private Comparator<Car> ascYear;
    static private Comparator<Car> descYear;
    static {
        ascYear = new Comparator<Car>(){
            @Override
            public int compare(Car c1, Car c2){
                // Java 7 has an Integer#compare function
                return Integer.compare(c1.getYear(), c2.getYear());
                // For Java < 7, use
                // Integer.valueOf(n1).compareTo(n2);
                // DO NOT subtract numbers to make a comparison such as n2 - n1.
                // This can cause a negative overflow if the difference is larger
                // than Integer.MAX_VALUE (e.g., n1 = 2^31 and n2 = -2^31)
            }
        };

        descYear = new Comparator<Car>(){
            @Override
            public int compare(Car c1, Car c2){
                return Integer.compare(c2.getYear(), c1.getYear());
            }
        };
    }

    private Car[] carSet;

    public CarSet(Car[] carSet){
        this.carSet = carSet;
    }

    public Car[] getCarSet(){ return carSet;}

    public void sortAscByYear(){
        Arrays.sort(carSet, ascYear);
    }

    public void sortDescByYear(){
        Arrays.sort(carSet, descYear);
    }

    @Override
    /*public String toString() {
        return "CarSet{" +
                "carSet=" + Arrays.toString(carSet) +
                '}';
    }*/
    public String toString() {
        String result="";
        for (Car car : carSet) {
            result = result + car + "\n";
        }
        return result;
    }

    public String toString(int year) {
        String result="";
        for (Car car : carSet) {
            if (car.getYear() == year) {
                result = result + car + "\n";
            }
        }
        return result;
    }

    public void printCarSetByYear(int year){
        for (Car car : carSet) {
            if (car.getYear() == year){
                System.out.println(car);
            }
        }
    }
}
