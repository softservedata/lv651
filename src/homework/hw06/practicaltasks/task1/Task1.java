package homework.hw06.practicaltasks.task1;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Sedan(290, 2003);
        Car car2 = new Truck(300, 2008);
        Car car3 = new Truck(240, 1999);
        Car car4 = new Sedan(150, 2000);
        Car car5 = new Sedan(130, 1998);
        Car[] cars = {car1, car2, car3, car4, car5};

        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
