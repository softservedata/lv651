package homework.hw08.practicaltasks.task1;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = Car.getCar()
                .addModel("Mercedes")
                .addColor("Black")
                .addDateOfProduction()
                .addEngineCapacity(100)
                .addPassengerCapacity(5)
                .setAirConditioningTrue()
                .build();
        System.out.println(car1);

        Car car2 = Car.getCar()
                .addModel("BMW")
                .addColor("Grey")
                .addDateOfProduction()
                .addEngineCapacity(115)
                .addPassengerCapacity(4)
                .setAirConditioningFalse()
                .build();
        System.out.println(car2);

        Car car3 = Car.getCar()
                .addModel("Toyota")
                .addColor("Red")
                .addDateOfProduction()
                .addEngineCapacity(105)
                .addPassengerCapacity(4)
                .setAirConditioningTrue()
                .build();
        System.out.println(car3);

        Car car4 = Car.getCar()
                .addModel("Porsche")
                .addColor("Blue")
                .addDateOfProduction()
                .addEngineCapacity(140)
                .addPassengerCapacity(2)
                .setAirConditioningTrue()
                .build();
        System.out.println(car4);
    }
}
