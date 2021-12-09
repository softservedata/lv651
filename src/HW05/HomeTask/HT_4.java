package HW05.HomeTask;

import java.util.Arrays;
import java.util.Scanner;

public class HT_4 {
    /*Create class Car with fields type, year of production and engine capacity.
      Create and initialize four instances of class Car.
      Display cars
        - certain model year  (enter year in the console);
        - ordered by the field year.
*/

    public static void main(String[] args) {

        CarSet carSet = new CarSet(new Car[]{
                new Car(CarProducer.MERCEDES,CarType.COUPE,2017, 1.4),
                new Car(CarProducer.RENAULT,CarType.SEDAN,2007, 1.4),
                new Car(CarProducer.HONDA,CarType.SEDAN,2007, 1.8),
                new Car(CarProducer.OPEL,CarType.STATION_WAGON,1982, 1.2)
        });

        carSet.sortAscByYear();
        //carSet.sortDescByYear();
        //System.out.println(Arrays.toString(carSet.getCarSet()));
        System.out.println(carSet.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year to display car list:");
        int year = Integer.parseInt(scanner.nextLine());
        //carSet.printCarSetByYear(year);
        String carSetFiltered = carSet.toString(year);
        if (carSetFiltered.length()==0){
            System.out.println("There is no cars " + year + " year.");
        }else{
            System.out.println(carSetFiltered);
        }
        scanner.close();
    }
}
