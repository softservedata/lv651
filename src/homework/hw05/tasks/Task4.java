package homework.hw05.tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car1 = new Car("Toyota Camry",2007, 1.9);
        Car car2 = new Car("Honda Accord",1990, 2.0);
        Car car3 = new Car("Ford Taurus",2003, 2.0);
        Car car4 = new Car("Nissan Rogue",2021, 3.0);
        Car tmp;
        Car[] cars = {car1, car2, car3, car4};

        System.out.println("enter model year: ");
        int year = sc.nextInt();

        for (Car car : cars) {
            if (car.getYearOfProduction() == year) {
                System.out.println(car.toString());
            }
        }

        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        System.out.println("\nCars sorted by year of production");
        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}
